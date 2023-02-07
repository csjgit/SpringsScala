package org.springscala.config

class FunctionalProg extends App {
  val f:Int=>Int =(x:Int)=>2*x;
  System.out.println(f(4));

  class Person(name: String) {
    def apply(age: Int): Unit = {
      println(s"I have age $age");
    }
  }

  val bob =new Person("bob");
  bob.apply(34);
  bob(43);
  /*

   */


}
