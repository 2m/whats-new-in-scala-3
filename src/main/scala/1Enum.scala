object Enum {

  enum Color { case Red, Green, Blue }

  def main(args: Array[String]): Unit = {
    println(s"Roses are ${Color.Red}")
    println(s"Violets are ${Color.Blue}")
    println("Dotty is sweet")
    println("And so are you")
  }
}
