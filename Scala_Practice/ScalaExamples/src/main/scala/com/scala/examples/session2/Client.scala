package com.scala.examples.session2

object Client extends App{
  
  val obj = new Book("Title")
  
  
  obj.printTitle(new Book("New Title"))
  
}