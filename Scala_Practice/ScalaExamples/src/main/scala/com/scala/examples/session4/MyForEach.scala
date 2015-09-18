package com.scala.examples.session4

class MyList(val l : List[String]){
  def myforeach(f:String => Unit) = {
    for(element <- l ){
      f(element)
    }
  }
}



object MyForEach extends App {
  
  val obj = new MyList(List("hi","hello","bye"))
  obj.myforeach { x => println(x) }
  
}

