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

  "A bill calculator" should "know the price of steak sandwich in pence" in {

    val actual = BillCalculator.Prices("steak sandwich")
    actual must equal(450)
  }

  "A bill calculator" should "calculate the total bill of a list of items in pounds and pence" in {
    val calculator = new BillCalculator()

    val actual = calculator.calculate(List("Cola", "Coffee", "Cheese Sandwich"))
    actual must equal(3.5)
  }
}
