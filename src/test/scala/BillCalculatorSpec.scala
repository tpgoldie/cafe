import org.scalatest.{FlatSpec, MustMatchers}

class BillCalculatorSpec extends FlatSpec with MustMatchers {

  "A bill calculator" should "know the price of cola in pence" in {

    val actual = BillCalculator.Prices("cola")
    actual must equal(50)
  }

  "A bill calculator" should "know the price of coffee in pence" in {

    val actual = BillCalculator.Prices("coffee")
    actual must equal(100)
  }

  "A bill calculator" should "know the price of cheese sandwich in pence" in {

    val actual = BillCalculator.Prices("cheese sandwich")
    actual must equal(200)
  }
}
