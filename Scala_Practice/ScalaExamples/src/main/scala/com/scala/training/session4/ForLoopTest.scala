package com.scala.training.session4

object ForLoopTest extends App{
  
  val numList = List(1,2,3,4,5,6)
  
  val greaterT3 = for(item <- numList if item >3) yield item
  
  println(greaterT3)

}