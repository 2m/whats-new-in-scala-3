object Basics {

  def main(args: Array[String]) = {
    val arguments = if args.isEmpty then "no arguments" else "some arguments"
    println(s"Hello. I am here for $arguments")

    //println(42 == "42")
  }

}