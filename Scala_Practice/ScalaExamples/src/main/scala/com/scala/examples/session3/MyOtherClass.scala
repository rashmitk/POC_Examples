package com.scala.examples.session3

object MyOtherClass {
  def main(args: Array[String]): Unit = {
   val myMap = scala.collection.mutable.Map(1->"aa", 2->"bb")
   
   println(myMap(1))
   
   myMap(1) = "xx"
   
   println(myMap(1))
    
    
    
  }

}