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
    println(s"When you mix ${Color.Red} and ${Color.Green}")
    println(s"you get ${Color.Red add Color.Green}")
  }
}
