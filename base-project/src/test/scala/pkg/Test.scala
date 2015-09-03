package pkg

import org.scalatest._

/**
 * Example of a test.
 */
class Test extends FlatSpec with Matchers {

  "A dummy test" should "succeed" in {
    assert(1 != 0)
    (1 + 1) should be(2)
  }
}
