package com.scala.examples.session5

trait A1 {
  def hi =println("a")
}
trait B1 extends A1 {
  override def hi =println("b1")
  super.hi
}
trait C1 extends A1 {
  override def hi =println("c1")
  super.hi
}
trait D1 extends A1 {
  override def hi =println("d1")
  super.hi
}
trait E1 extends A1 {
  override def hi =println("e1")
  super.hi
}

class X extends E1 with D1 with C1 with B1

/*
object Client1 extends App {
  val x = new X()
}
*/
