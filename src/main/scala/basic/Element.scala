package basic

abstract class Element {
  def contents: Vector[String]

  def height: Int = contents.length;

  def m = System.out.println("Element class")

  def width: Int =
    if (height == 0)
      0
    else
      contents(0).length

  val h = contents.length
  val w = contents(0).length

  def above(that: Element): Element = new VectorElement(this.contents ++ that.contents)

  def beside(that: Element): Element = {
    new VectorElement(for {(line1, line2) <- this.contents.zip(that.contents)} yield line1 + line2)
  }


}
object Element
{
  def x()="c";
}



