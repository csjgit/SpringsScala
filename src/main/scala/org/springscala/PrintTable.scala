package org.springscala

import java.io.File

object PrintTable
{
  val p=10;
  def example(a:Double) = a*p / 100;




  def main(args: Array[String]): Unit = {
    val z= example(10.0);
    System.out.println(z);
    val a=sum(_,_,_);
    val b=sum(3,4,_);

    var s= b.apply(1);
    System.out.println(s);
   /* var i=1;
    while (i<=10)
      {
        var j=1;

        while(j<=10)
          {
            System.out.print(i*j);
            System.out.print(" ");
            j+=1;
          }
        System.out.println();
        i+=1;
      }*/
   val table = multiTable()
//    System.out.println(table.mkString("\n"))
  }

  def makeRow(row:Int) =
  {
    val num= Seq.range(1,10);
    for
      {
        n <- num

      }  yield n*row;
  }
  def multiTable() =
  {
    val num= Seq.range(1,10);
    for {
      n <- num
    }
      yield makeRow(n);
  }
  def sum (a:Int,b:Int,c:Int) :Int={
    a + b + c;
  }

  private def fileList= new File(".").listFiles;


  private def fileMatching(matcher: String => Boolean) = {
    for {
      file <- fileList if matcher(file.getName)
    }
    yield file

  }
  def filesEnding(query:String)=fileMatching(_.endsWith(query));
  def filesContain(query:String)=fileMatching(_.contains(
    query));

  def twice(op:Double=>Double,x:Double)=op(op(x))
   twice(x=>x+1,5);

}
