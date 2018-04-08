package chapter2.exercise5

import org.scalatest.{FunSpec, Matchers}

class ComposeSpec extends FunSpec with Matchers {

  describe("Functional composition") {

    it("should compose addition") {
      def addFive(x: Int): Int = x + 5
      def divideByTwo(x: Int): Int = x / 2

      val addFiveThenDivideByTwo = Compose.compose(divideByTwo, addFive)

      addFiveThenDivideByTwo(15) should equal(10)
    }
  }
}

