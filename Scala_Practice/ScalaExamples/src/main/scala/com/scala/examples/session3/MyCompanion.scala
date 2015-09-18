package com.scala.examples.session3

/**
 * @author rashmitr
 */
class MyCompanion private (val name: String) {
  

  private def sayHello() = {
    "Hello " + name
  }

  private def sayGoodBye() = {
    MyCompanion.getByeMsg() + name + " !"
  }
 
  
}

object MyCompanion extends App {
  
 def apply(s : String) = new MyCompanion(s)

  private def getByeMsg() = {
    "Good Bye "
  }

  val obj = new MyCompanion("James")
  
  println(obj sayHello ())
  println(obj sayGoodBye ())

}



