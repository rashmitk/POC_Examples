package com.scala.examples

class Car {
  def turn(direction : String) : String = "Turning "+direction
}

object Car{
  def main(args: Array[String]): Unit = {
    val car = new Car()
    println(car turn "Right")
  }
}