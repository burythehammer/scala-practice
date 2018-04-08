package chapter2.exercise1

import org.scalatest.{BeforeAndAfter, FunSpec, Matchers}

class FibonacciSpec extends FunSpec with BeforeAndAfter with Matchers {

  describe("Fibonacci method") {

    it("should calculate the 0th fibonacci number") {
      val result = Fibonacci.calculate(0)
      result should equal (0)
    }

    it("should calculate the 1st fibonacci number") {
      val result = Fibonacci.calculate(1)
      result should equal (0)
    }

    it("should calculate the 2nd fibonacci number") {
      val result = Fibonacci.calculate(2)
      result should equal (1)
    }

    it("should calculate the 3rd fibonacci number") {
      val result = Fibonacci.calculate(3)
      result should equal (1)
    }

    it("should calculate the 5th fibonacci number") {
      val result = Fibonacci.calculate(5)
      result should equal (3)
    }

    it("should calculate the 12th fibonacci number") {
      val result = Fibonacci.calculate(12)
      result should equal (89)
    }

    it("should handle a negative input") {
      val result = Fibonacci.calculate(-1)
      result should equal (0)
    }

    it("should handle a large negative input") {
      val result = Fibonacci.calculate(-1000)
      result should equal (0)
    }

  }

}
