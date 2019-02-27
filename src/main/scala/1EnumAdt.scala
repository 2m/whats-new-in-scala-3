object EnumAdt {

  enum Color(val rgb: Int) {
    case Red   extends Color(0xFF0000)
    case Green extends Color(0x00FF00)
    case Blue  extends Color(0x0000FF)
    case Mix(mix: Int) extends Color(mix)

    def add(c: Color) = Mix(this.rgb | c.rgb)
    def sub(c: Color) = Mix(this.rgb & c.rgb)
  }

  def main(args: Array[String]): Unit = {
    println(s"Roses are ${Color.Red}")
    println(s"Violets are ${Color.Blue}")
    println("Dotty is sweet")
    println("And so are you")
  }
}