package com.scala.examples.session5

class Animal {
  def sayHi = println("I am Animal")
}
trait Furry extends Animal {
  override def sayHi = {

    println("I m Furry")
    super.sayHi
  }
}
trait HasLegs extends Animal {
  override def sayHi = {
    println("I have legs")
    super.sayHi
  }

}
trait FourLegged extends HasLegs {
  override def sayHi = {
    println("I have four legs")
    super.sayHi
  }
}
class SuperCat extends FourLegged with Furry

object SuperCatClient extends App {
  val obj = new SuperCat

  obj.sayHi
}

