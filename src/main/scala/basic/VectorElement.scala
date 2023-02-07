package basic

class VectorElement(conts:Vector[String]) extends  Element {
  override def contents: Vector[String] = conts
  override  def m=System.out.println("VectorElement class")
}
