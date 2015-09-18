package com.scala.examples.session3

/**
 * @author rashmitr
 */

class Person(val name: String, val age: Int)

object Person {

  val p1 = new Person("Person1", 20)
  val p2 = new Person("Person2", 10)
  val p3 = new Person("Person3", 28)

  def getAdults: List[String] = List(p1, p2, p3).filter { p => p.age > 18 }.map { p => p.name }

  def main(args: Array[String]): Unit = {
    println(getAdults)
  }

}
