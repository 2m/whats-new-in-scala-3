object ExtensionMethodsClassic {
  implicit class IntOps(i: Int) {
    def hex: String =
      i.toHexString.reverse.padTo(6, "0").reverse.mkString.toUpperCase
  }

  def main(args: Array[String]) = {
    println(0xFF0000.hex)
    println(0x00FF00.hex)
    println(0x0000FF.hex)
  }
}