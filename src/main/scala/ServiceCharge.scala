class ServiceCharge {

  def charge(items : List[String]): Int = {

    if (allDrinks(items)) { return 0 }

    items.map(item => BillCalculator.priceOf(item)).sum / 10
  }

  private def allDrinks(items: List[String]): Boolean = {

    val groupings: Map[Boolean, Seq[String]] = items.groupBy(item => BillCalculator.Drinks.contains(item.toLowerCase))

    val notDrinks = groupings.getOrElse(false, List())

    notDrinks.isEmpty
  }
}
