package chapter2.exercise3

import org.scalatest.{FunSpec, Matchers}

class CurrySpec extends FunSpec with Matchers {

  describe("Functional currying") {

    it("should curry addition") {
      def addTwoNumbers(x: Int, y: Int): Int = x + y
      val curriedFunction = Curry.curry(addTwoNumbers)
      val addFiveToNumber = curriedFunction(5)
      addFiveToNumber(20) should equal (25)
    }

    it("should curry string concatenation") {
      def concatenateStrings(x: String, y: String): String = x.concat(y)
      val curriedFunction = Curry.curry(concatenateStrings)
      val attributeQuoteToShakespeare = curriedFunction("Shakespeare said: ")
      attributeQuoteToShakespeare("Hell is empty and all the devils are here") should equal ("Shakespeare said: Hell is empty and all the devils are here")
    }
  }
}
