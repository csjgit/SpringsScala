package org.springscala.config
sealed trait P
{
def x();
}
 trait P1
{
  def x();
}
class LearnTrait  extends P{
  override def x(): Unit = ???
}
