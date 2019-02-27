object ImpliedInstances {
  trait Show[T] {
    def show(s: T): String
  }

  implied IntShow for Show[Int] {
    def show(s: Int) = s"Int($s)"
  }

  implied for Show[Double] {
    def show(s: Double) = s"Double($s)"
  }

  def show[T](t: T) given (s: Show[T]) =
    s.show(t)

  def main(args: Array[String]) = {
    println(show(42))
    println(show(42.42))
  }
}