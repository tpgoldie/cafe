import org.scalatest.{FeatureSpec, GivenWhenThen, MustMatchers}

class ServiceChargeSpec extends FeatureSpec with GivenWhenThen with MustMatchers {
  feature("all purchase items are drinks no service charge is applied") {

    scenario("all purchase items are drinks") {

      val items = List("Cola", "Cola", "Coffee")

      val serviceCharge = new ServiceCharge()

      val actual = serviceCharge.charge(items)
      actual must equal(0)
    }

    scenario("Some purchase items are cold foods ") {

      val items = List("Cola", "Cheese Sandwich", "Coffee", "Cheese Sandwich")

      val serviceCharge = new ServiceCharge()

      val actual = serviceCharge.charge(items)
      actual must equal(55)
    }
  }
}
