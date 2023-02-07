package org.springscala.config

object LeanrApp extends App {

  val atuple= ("x","y");
  System.out.print(atuple._1,atuple._2);
  val list =List(11,12,13,14)
 val z = for{
    x<-list if x%2==0
  }
    yield  s"$x";

  System.out.print(z);
}

