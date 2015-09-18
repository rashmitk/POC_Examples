package com.scala.examples.session3

case class NewPerson(name:String, age:Int, valid:Boolean)

object PatternMatchPersonObj {
  
  val p1 = NewPerson("p1", 30, true)
  val p2 = NewPerson("p2", 100, true)
  val p3 = NewPerson("p3", 25, false)
  
  def isAdult(p : NewPerson):String = {
    p match{
      case NewPerson(name, age, true) if age > 18 => name
      case _ => ""
    }
  }
  
  def main(args: Array[String]): Unit = {
    
    List(p1,p2,p3).foreach { p1 => println(isAdult(p1)) }
    
  }

}