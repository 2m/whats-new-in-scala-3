object ContextQueries {
  case class Config(user: String)
  type Configurable[T] = given Config => T

  def fancy: Configurable[String] =
    the[Config].user.toUpperCase

  def greet: Configurable[String] =
    s"Hello $fancy"

  def main(args: Array[String]) =
    println(greet given Config("Desmond"))
}