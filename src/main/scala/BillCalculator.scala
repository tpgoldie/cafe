class BillCalculator {

  private val serviceChargable = new ServiceChargable

  def calculate(items: List[String]): Float = {

    val unitCost = items.map(item => BillCalculator.priceOf(item)).sum

    val serviceCharge = serviceChargable.charge(items)

    (unitCost + serviceCharge) /  BillCalculator.PoundsConversionFactor
  }
}

object BillCalculator {

  private val Prices : Map[String, Int] = Map("cola" -> 50, "coffee" -> 100, "cheese sandwich" -> 200, "steak sandwich" -> 450)

  def priceOf(key: String): Int = { Prices.getOrElse(key.toLowerCase, 0) }

  val PoundsConversionFactor: Float = 100.0f

  val Drinks : Set[String] = Set("cola", "coffee")

  val Foods : Set[String] = Set("cheese sandwich", "steak sandwich")

  val HotFoods : Set[String] = Set("steak sandwich")
}
