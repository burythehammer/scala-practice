package chapter2.exercise2

import org.scalatest.{BeforeAndAfter, FunSpec, Matchers}

class IsSortedSpec extends FunSpec with BeforeAndAfter with Matchers {

  describe("IsSorted method") {

    def ascendingInts(x: Int, y: Int): Boolean = {
      x < y
    }

    def ascendingStrings(x: String, y: String): Boolean = {
      val result = x.compareTo(y)
      result < 0
    }

    describe("Sorting integers") {
      it("should return true for an empty array") {
        val array = Array[Int]()
        val result = IsSorted.isSorted(array, ascendingInts)
        result should be(true)
      }

      it("should return true for an array with a single int") {
        val array = Array[Int](1)
        val result = IsSorted.isSorted(array, ascendingInts)
        result should be(true)
      }

      it("should return true for an array with ints in order") {
        val array = Array[Int](3, 7, 5, 2, 2000, 10, 60, 9999).sortWith(_ < _)

        val result = IsSorted.isSorted(array, ascendingInts)
        result should be(true)
      }

      it("should return false for an array with ints out of order") {
        val array = Array[Int](2, 1, 40, 9000000, 2000)
        val result = IsSorted.isSorted(array, ascendingInts)
        result should be(false)
      }

    }

    describe("Sorting strings") {

      it("should return true for an array with no strings") {
        val array = Array[String]()
        val result = IsSorted.isSorted(array, ascendingStrings)
        result should be(true)
      }

      it("should return true for an array with a single string") {
        val array = Array[String]("foo")
        val result = IsSorted.isSorted(array, ascendingStrings)
        result should be(true)
      }

      it("should return true for an array with alphabetical strings") {
        val array = Array[String]("A used copy of Private Eye","Fish", "Smart phones", "Knives", "Trampolines").sortWith(_ < _)
        val result = IsSorted.isSorted(array, ascendingStrings)
        result should be(true)
      }

      it("should return false for an array with out of order alphabetical strings") {
        val array = Array[String]("zebra", "xylophone", "christmas tree", "something else")
        val result = IsSorted.isSorted(array, ascendingStrings)
        result should be(false)
      }
    }


  }

}
