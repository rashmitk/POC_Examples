package com.scala.examples.session2

/**
 * @author rashmitr
 */

class SumCalculator(numList : List[Int]){
  
  def computeSum(selector : Int => Boolean) = {
    var sum = 0
    numList foreach { x => if(selector(x)) sum += x }
    sum
  }
  
}

object HOFAsArg {
  def main(args: Array[String]): Unit = {
    val obj = new SumCalculator(List(1,2,3,4,5))
    
    println(obj.computeSum({e => true}))
    println(obj.computeSum({e => e %2 == 0}))
    println(obj.computeSum({e => e %2 == 1}))
    println(obj.computeSum({e => e > 2 }))
    
  }
  
}