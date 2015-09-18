package com.scala.examples.session4

package com.scala.examples.session4

trait Base {
  def op: String
}

trait Foo extends Base {
  override def op = "foo"
}

trait Bar extends Base {
  override def op = "bar"
}

class A extends Foo with Bar
class B extends Bar with Foo

object TraitClient extends App {

  val a = new A
  println(a.op)

  val b = new B
  println(b.op)

}


