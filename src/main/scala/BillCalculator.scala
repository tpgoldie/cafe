class BillCalculator {

  def calculate(items: List[String]): Float = {

    items.map(item => BillCalculator.priceOf(item)).sum / BillCalculator.PoundsConversionFactor;
  }
}

object BillCalculator {

  private val Prices : Map[String, Int] = Map("cola" -> 50, "coffee" -> 100, "cheese sandwich" -> 200, "steak sandwich" -> 450)

  def priceOf(key: String): Int = { Prices.getOrElse(key.toLowerCase, 0) }

  val PoundsConversionFactor: Float = 100.0f
}
