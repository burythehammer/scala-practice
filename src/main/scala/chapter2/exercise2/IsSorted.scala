package chapter2.exercise2

object IsSorted {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.length == 0) return true

    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (n == as.length-1)
        return true
      if (ordered(as(n), as(n + 1)))
        loop(n + 1)
      else false
    }

    loop(0)
  }
}
