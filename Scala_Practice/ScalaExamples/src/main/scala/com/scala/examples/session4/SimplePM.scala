package com.scala.examples.session4

object SimplePatternMatch {

  def matchTest(num : Int) = {
    num match{
      case 1 => "Yes"
      case 0 => "No"
      case _ => "Invalid"
    }
  }


  def main(args: Array[String]): Unit = {

    println(matchTest(1))
    println(matchTest(0))
    println(matchTest(23))
  }
}