package org.springscala

case class Person(name: String, age: Int) {
  //  def appendToName(suffix: String): Person =
  // Person(s"$name$suffix", age)
}
object Person {
    def apply(name: String, age: Int): Person = {
      val cap =
        if (!name.isEmpty) {
          val firsChar = name.charAt(0).toUpper
          val rest = name.substring(1)
          s"$firsChar$rest"
        }

        else
          throw new IllegalArgumentException("Empty name")
      new Person(cap, age)
    }


}
