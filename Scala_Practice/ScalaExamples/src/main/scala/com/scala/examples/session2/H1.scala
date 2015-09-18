package com.scala.examples.session2

object H1 {

  val add = (x: Int, y: Int) => x + y
  val multiply = (x: Int, y: Int) => x * y
  val one = (x1:Int) => x1*x1
  
  def operation(n1: Int, n2: Int, func: (Int, Int) => Int) {
    println(func(n1, n2))
  }
  
  def main(args: Array[String]): Unit = {
    operation(10, 10, add)
    operation(10, 10, multiply)
    //operation(1,2,one)
  }
  

}