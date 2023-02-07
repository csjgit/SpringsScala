package org.springscala.config

object Test1 extends App{
class Dog( val name:String)
  val dog= new Dog("x");
  dog.name;

  trait Program
  {
    def start();
  }
  trait Program1
  {
    def start1():Int;
  }

  class TestProgram extends Program with Program1
  {
    override def start(): Unit = ???

    override def start1(): Int = 2;

    def apply(x:Int):Int =x+5;
  }
  case class Person(name:String,age:Int)
  //val p=Person("Shekhar",35);

//Exceptions


  //def main(args: Array[String]): Unit = {
    val p =new TestProgram();
   // System.out.print(p(4));
    val p1=Person("Shekhar",35);
    System.out.print(p1)
   val list:List[String] =List("x","y","z")
   val filteredList = list.filter(x=>x.equals("z"))
    System.out.print(filteredList)
    val arr=Array(12,23);
    arr.foreach(x=>System.out.println(x));
    val set= Set("x","x");
    var x=4;
    x=x.+(4);
    System.out.print(x)

    //Point1-Scala is immutable values
    //Miracle threading
    //Making sense about code
x.equals()
    //Point2-Mix Object oriented/Functional





}
