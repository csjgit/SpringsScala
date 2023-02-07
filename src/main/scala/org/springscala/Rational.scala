package org.springscala

import java.io.File

class Rational(x:Int,y:Int) {
require(y!=0)
   val n:Int=x;
   val d:Int=y
  System.out.println(f"x and y are $x $y");

  def add(that:Rational):Rational={
     new Rational(n+that.n,d+that.d)
  }
   def +(that:Rational):Rational= new Rational(n+that.n,d+that.d)

   def -(that:Rational):Rational= new Rational(n-that.n,d-that.d);
}


object test {

  // def file = ???

  def main(args: Array[String]): Unit = {
    val r = new Rational(1, 2);
    val r1 = new Rational(1, 3);
    val result = r + r1;
    System.out.println(result)
    val result1 = r - r1;
    System.out.println(result1)

    var fileName = if (args.isEmpty) args(0)
    else "default.txt";
    System.out.println(fileName)
    val files = new File(".").listFiles()
    val filter= for {
      file <- files
       if(file.getName.endsWith("md"))
    }
    yield file

    System.out.println(filter)

  }

  case class Result[A](result: A)

 /* val result: Result[Int] = Result(42)
  for {
    res <- result
  }*/

}
