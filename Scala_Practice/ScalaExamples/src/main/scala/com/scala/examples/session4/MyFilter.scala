package com.scala.examples.session4

/**
 * @author rashmitr
 */
class MyFilter(val list: List[Integer]) {
  def myfilter(f: Integer => Boolean): List[Integer] = {
    for {
      item <- list
      if (f(item))
    } yield item
  }
}

object MyFilter extends App {

  val obj = new MyFilter(List(1,2,3,4,5,6,7,8,9,10))
 
  val lessT4 = obj.myfilter { x => x < 4 }
  val lessT7 = obj.myfilter { x => x < 7 }
  val greaterT6 = obj.myfilter { x => x > 6 }
  val greaterT9 = obj.myfilter { x => x > 9 }
  
  println(lessT4)
  println(lessT7)
  println(greaterT6)
  println(greaterT9)
  
}