package org.springscala.config

object PmatchEx {
  val aInteger =55;
  val order= aInteger match {
    case 1 => "first"
    case 2=>"second"
    case 3=>"third"
    case _=>aInteger+"th"

  }
  case class Person(name:String,age:Int)
  val bob= Person("x",22);
val x= bob match {
  case Person(a,b) =>s"Hi my name is $a and age $b"
}
}
