package com.scala.examples.session5

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  }
}

object S extends App {

  val doublingQueue = new BasicIntQueue with Doubling
  
  doublingQueue.put(10)
  println(doublingQueue.get())

  println("--------------------------------------------------------------")
  
  val queue1 = (new BasicIntQueue with Incrementing with Filtering)
  queue1.put(-1)
  queue1.put(0)
  queue1.put(1)
  
  println(queue1.get())
  println(queue1.get())
  
  println("--------------------------------------------------------------")

  val queue2 = (new BasicIntQueue with Filtering with Incrementing)

  queue2.put(-1)
  queue2.put(0)
  queue2.put(1)

 println( queue2.get())
  println(queue2.get())
  println(queue2.get())
  
}