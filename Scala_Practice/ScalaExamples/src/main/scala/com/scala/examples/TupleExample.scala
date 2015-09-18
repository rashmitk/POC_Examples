package com.scala.examples

/**
 * @author rashmitr
 */
class TupleExample {
  
  def getPersonById(id : Int)={
    ("Rashmit", "Rathod", "rashmit.rathod@yahoo.com")
  }
  
}

object TupleExample{
  def main(args: Array[String]): Unit = {
   val obj = new TupleExample
   val person = obj.getPersonById(1)
   val (fn, ln, mail ) = obj.getPersonById(1)
   
   println(person)
   println(person._1)
   println(person._2)
   println(person._3)
   println("----------------")
   println(fn)
   println(ln)
   println(mail)
   
  }
}