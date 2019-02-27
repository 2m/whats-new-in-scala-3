object UnionTypes {
  case class Square(length: Int)
  case class Circle(r: Int)

  def area(s: Square | Circle) = s match {
    case Square(length) => length * length
    case Circle(r) => 3.14 * r * r
  }

  def main(args: Array[String]) = {
    val s = Square(4)
    val c = Circle(2)
    println(s"$s area is ${area(s)}")
    println(s"$c area is ${area(c)}")
  }
}
