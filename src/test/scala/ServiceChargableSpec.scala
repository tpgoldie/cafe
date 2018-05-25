import org.scalatest.{FeatureSpec, GivenWhenThen, MustMatchers}

class ServiceChargableSpec extends FeatureSpec with GivenWhenThen with MustMatchers {
  feature("all purchase items are drinks no service charge is applied") {

    scenario("all purchase items are drinks") {

      val items = List("Cola", "Cola", "Coffee")

      val serviceCharge = new ServiceChargable()

      val actual = serviceCharge.charge(items)
      actual must equal(0)
    }

    scenario("Some purchase items are cold foods ") {

      val items = List("Cola", "Cheese Sandwich", "Coffee", "Cheese Sandwich")

      val serviceCharge = new ServiceChargable

      val actual = serviceCharge.charge(items)
      actual must equal(55)
    }

    scenario("Some purchase items are hot foods ") {

      val items = List("Cola", "Cheese Sandwich", "Coffee", "Steak Sandwich")

      val serviceCharge = new ServiceChargable

      val actual = serviceCharge.charge(items)
      actual must equal(160)
    }
  }
}
