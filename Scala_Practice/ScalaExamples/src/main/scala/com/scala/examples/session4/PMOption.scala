package com.scala.examples.session4

object PMOption {
  def toInt(s: String): Option[Int] = {
    try {
      Some(Integer.parseInt(s))
    } catch {
      case e: NumberFormatException => None
    }
  }

  def matchTest(s: String) {
    toInt(s) match {
      case Some(s) => println(s)
      case None    => println("Not an integer")
    }
  }

  def main(args: Array[String]): Unit = {
    for (str <- List("2", "two", "three", "4")) {
      matchTest(str)
    }
  }
}