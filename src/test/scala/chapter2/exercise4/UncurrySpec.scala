package chapter2.exercise4

import chapter2.exercise3.Curry
import org.scalatest.{FunSpec, Matchers}

class UncurrySpec extends FunSpec with Matchers {

  describe("Functional uncurrying") {

    it("should uncurry addition") {
      def addTwoNumbers(x: Int, y: Int): Int = x + y

      val curriedFunction = Curry.curry(addTwoNumbers)
      val uncurriedFunction: (Int, Int) => Int = Uncurry.uncurry(curriedFunction)

      uncurriedFunction(4, 10) should equal(14)
    }
  }
}
