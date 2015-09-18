package com.scala.examples.session4

/**
 * @author rashmitr
 */
trait Animal {
  def sayHello:String
}

class Cat extends Animal{
  def sayHello = "Meow.."
}

object AnimalClient extends App{
  val catObj = new Cat
  println(catObj sayHello)
}