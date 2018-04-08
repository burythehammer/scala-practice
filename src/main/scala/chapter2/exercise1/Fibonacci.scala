package chapter2.exercise1

object Fibonacci {

  def calculate(x: Int): Int = {
    if (x <= 1)
      0
    else if (x == 2)
      1
    else
      calculate(x - 1) + calculate(x - 2)
  }

}