package com.scala.examples.session3

object PatternMatchGuard {
  def myMatch(l: List[Any]){
    
    l.foreach( element => element match{
      case s : String => println("String")
      case i : Int => println("Integer")
      case d : Double => println("Double")
      
    })
    
    
  }
  def main(args: Array[String]): Unit = {
    myMatch(List("aa",22,9.9))
  }
}