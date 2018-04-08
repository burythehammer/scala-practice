package chapter2.exercise4



object Uncurry {
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => {
      val g = f(a)
      g(b)
    }
  }
}

