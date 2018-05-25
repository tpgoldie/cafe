import org.scalatest.{FlatSpec, MustMatchers}

class BillCalculatorSpec extends FlatSpec with MustMatchers {

  "A bill calculator" should "know the price of cola in pence" in {

    val actual = BillCalculator.Prices("cola")
    actual must equal(50)
  }
}
