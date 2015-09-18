package com.scala.examples.session5

trait Human {
  def sayHello = "Hello Human"
}
trait Mother extends Human {
  override def sayHello = "Hello Mother"
}
trait Father extends Human {
  override def sayHello = "Hello Father"
}

class Child extends Human with Mother with Father {
  def printSuper = super.sayHello
  def printMother = super[Mother].sayHello
  def printFather = super[Father].sayHello
  def printHuman = super[Human].sayHello
}

object SuperTraitClient {

  def main(args: Array[String]): Unit = {
    val obj = new Child
    println(obj.printSuper)
    println(obj.printMother)
    println(obj.printFather)
    println(obj.printHuman)

  }
}