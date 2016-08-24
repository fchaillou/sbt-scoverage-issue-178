
import org.specs2.mutable.Specification

class End2EndSpec extends Specification {

  "addition" should {
    "properly add 2 values" in {
      val example = new Example

      example.addition(1, 2) must beEqualTo(3)
    }
  }
}
