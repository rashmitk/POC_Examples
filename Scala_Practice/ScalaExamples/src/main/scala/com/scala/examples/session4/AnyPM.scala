package com.scala.examples.session4

object AnyPM {

  def matchTest(myList: List[Any]) {

    for (e <- myList){
      e match {
        case s: String => println("String")
        case i: Int    => println("Integer")
        case c: Char   => println("Character")
        case d: Double => println("Double")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    matchTest(List("Hello", 12, 'A', 22.34, "Bye", 'b'))
  }
}