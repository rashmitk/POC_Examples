package com.scala.examples.session6

object MyStringImplicit {
  implicit class StringUtils(str: String) {
    def increment = str.map(ch => (ch + 1).toChar)
    def decrement = str.map(ch => (ch - 1).toChar)
  }

}

object Client2 extends App {
  
  import com.scala.examples.session6.MyStringImplicit._
  
  val s1 = "HAL".increment
  println(s1)

  val s2 = s1.decrement
  println(s2)

}