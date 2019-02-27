object IntersectionTypes {
  trait HasEdges(val length: Int)
  trait HasVertices(val vertices: Int)

  def perimeter(s: HasEdges & HasVertices) =
    s.length * s.vertices

  def main(args: Array[String]) = {
    val shape = new HasEdges(10) with HasVertices(4)
    println(s"Perimeter is ${perimeter(shape)}")
  }
}
