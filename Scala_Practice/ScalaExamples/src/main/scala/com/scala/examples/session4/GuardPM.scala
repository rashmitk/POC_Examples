package com.scala.examples.session4

object GuardPM {
  def matchTest(num: Int) = {
    num match {
      case 1 | 0      => "Yes"
      case n if n < 0 => "No"
      case _          => "Invalid"
    }
  }

  def main(args: Array[String]): Unit = {

    println(matchTest(1))
    println(matchTest(0))
    println(matchTest(2))
    println(matchTest(-1))
 
  }
}