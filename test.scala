@main def m()=
println("hi")
var greeStrings =new Array[String](3)
greeStrings(0)="Hello"
greeStrings(1)=", "
greeStrings(2)="world\n"
greeStrings.update(0,"hhh")
val color=Array("Red","blue","orange");
for i <- 0 to 2
print(greeStrings(i))
