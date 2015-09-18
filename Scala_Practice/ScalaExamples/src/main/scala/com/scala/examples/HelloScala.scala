package com.scala.examples

import java.util.Random

object HelloScala {
  
  def incBy2(x:Int) = x *2
  
  def incByRandom(x:Double) = {
    val r = new Random().nextInt(10) 
    println(r)
    x * r
  }
  
  def main(args : Array[String]):Unit = {
    println("Hello Scala..")
    
    println(incBy2(10))
    println(incByRandom(10))
  }
}