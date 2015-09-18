package com.scala.examples.session5

trait PizzaTrait {
  var numToppings: Int
  var size = 14
  val maxNumTopping = 10
}

class Pizza extends PizzaTrait{
  var numToppings = 1
  size = 15
  
  override val maxNumTopping = 12
}

object TraitClient2 extends App{
  val obj = new Pizza()
  
  println(obj.numToppings)
  println(obj.size)
  println(obj.maxNumTopping)
}