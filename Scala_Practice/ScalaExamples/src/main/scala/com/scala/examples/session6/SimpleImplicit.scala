package com.scala.examples.session6



class MyInteger(i: Int) {
  def myMethod = println("Its myMethod call")
    
}

object MyInteger extends App{
  val m = new MyInteger(1)
  implicit def intTomymethod(i : Int) = new MyInteger(i)

  1.myMethod
}

