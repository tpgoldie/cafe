import org.scalatest.{FlatSpec, MustMatchers}

class BillCalculatorSpec extends FlatSpec with MustMatchers {

  "A bill calculator" should "know the price of cola in pence" in {

    val actual = BillCalculator.priceOf("cola")
    actual must equal(50)
  }

  "A bill calculator" should "know the price of coffee in pence" in {

    val actual = BillCalculator.priceOf("coffee")
    actual must equal(100)
  }

  "A bill calculator" should "know the price of cheese sandwich in pence" in {

    val actual = BillCalculator.priceOf("cheese sandwich")
    actual must equal(200)
  }

  "A bill calculator" should "know the price of steak sandwich in pence" in {

    val actual = BillCalculator.priceOf("steak sandwich")
    actual must equal(450)
  }

  "A bill calculator" should "return zero for an unknown item" in {

    val actual = BillCalculator.priceOf("baked beans")
    actual must equal(0)
  }

  "A bill calculator" should "calculate the total bill of a list of items in pounds and pence" in {
    val calculator = new BillCalculator()

    val actual = calculator.calculate(List("Cola", "Coffee", "Cheese Sandwich"))
    actual must equal(3.5)
  }
}
