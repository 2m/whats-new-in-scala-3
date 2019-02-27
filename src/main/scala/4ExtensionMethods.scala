object ExtensionMethods {
  def (i: Int) hex: String =
    i.toHexString.reverse.padTo(6, "0").reverse.mkString.toUpperCase

  // compare operator
  // subtract from all elements in seq

  def main(args: Array[String]) = {
    println(0xFF0000.hex)
    println(0x00FF00.hex)
    println(0x0000FF.hex)
  }
}