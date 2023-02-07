package book

import scala.::
import scala.collection.mutable

object Learn extends  App{

  def max(x:Int,y:Int):Int={
    if (x>y)x
    else y
  }

  var greeStrings =new Array[String](3)
  greeStrings(0)="Hello"
  greeStrings(1)=", "
  greeStrings(2)="world\n"
 val oneTwo = List(1,2,3);
 val list1= 1::oneTwo
 //val list2= oneTwo::::2;
 System.out.println(list1)
  var jetSet= Set("xyz","pqr");
  jetSet+="xyzq";
  System.out.println(jetSet)
  mutable.Set("x","y")
  //mutable.
}
