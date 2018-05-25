class BillCalculator {

  def calculate(items: List[String]): Float = {

    items.map(item => BillCalculator.Prices(item.toLowerCase)).sum / BillCalculator.PoundsConversionFactor;
  }
}

object BillCalculator {

  val Prices : Map[String, Int] = Map("cola" -> 50, "coffee" -> 100, "cheese sandwich" -> 200, "steak sandwich" -> 450)

  val PoundsConversionFactor: Float = 100.0f
}
