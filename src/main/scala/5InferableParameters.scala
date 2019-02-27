object InferableParameters {
  case class Config(user: String)

  def fancy given Config =
    the[Config].user.toUpperCase

  def greet given Config =
    s"Hello $fancy"
  
  def main(args: Array[String]) =
    println(greet given Config("Desmond"))
}