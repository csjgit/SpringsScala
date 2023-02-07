package org.springscala.config

object Advanced extends App
{

  lazy val x=2;
   lazy val xside= {
    print("I am so lazy")
     43
  }
  val eager= xside+56;
def method1():String =null;
  //defense
  val o=Option(method1())
 // System.out.print(o)
 val check = o match {
    case Some(value) =>s"i got something"
    case None =>s"I have not got anything"
  }
  System.out.print(factorial(4))


  def factorial(x:Int): Int =
  {
    if(x==0||x==1) 1 else x*factorial(x-1)
  }
  val c1 = CaseExample("xyz",123);
  System.out.print(c1)

}
