package traitex

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends  IntQueue {
  private val buff = ArrayBuffer.empty[Int]
  override def get(): Int = buff.remove(0)

  override def put(x: Int): Unit = {
    System.out.println("I m called***********")
    buff +=x};
}
