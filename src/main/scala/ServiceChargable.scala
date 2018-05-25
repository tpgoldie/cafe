import BillCalculator.{Drinks, Foods, HotFoods}
import ServiceChargable.{TenPercentFactor, TwentyPercentFactor}

class ServiceChargable {

  def charge(items : List[String]): Int = {

    val totalCost = items.map(item => BillCalculator.priceOf(item)).sum

    if (hasHotFoods(items)) { return totalCost / TwentyPercentFactor }
    if (hasFoods(items)) { return totalCost / TenPercentFactor }
    0
  }

  private def allDrinks(items: List[String]): Boolean = {

    val groupings = groupBy(items, Drinks)

    val notDrinks = groupings.getOrElse(false, List())

    notDrinks.isEmpty
  }

  private def groupBy(items: List[String], values: Set[String]): Map[Boolean, Seq[String]] = items.groupBy(item =>
      values.contains(item.toLowerCase))

  private def hasFoods(items: List[String]): Boolean = {

    val groupings = groupBy(items, Foods)

    val hotFoods = groupings.getOrElse(true, List())

    hotFoods.nonEmpty
  }

  private def hasHotFoods(items: List[String]): Boolean = {

    val groupings = groupBy(items, HotFoods)

    val hotFoods = groupings.getOrElse(true, List())

    hotFoods.nonEmpty
  }
}

object ServiceChargable {

  val TenPercentFactor: Int = 10

  val TwentyPercentFactor: Int = 5
}