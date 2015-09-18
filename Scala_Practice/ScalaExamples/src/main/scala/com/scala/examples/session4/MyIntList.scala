package com.scala.examples.session4

class MyIntList(val numList: Seq[Int]){
  
  def myfilter(f : Int => Boolean):List[Int]={
    for(num <- numList.toList if(f(num))) yield num
  }
}

object MyIntList {
  def apply(numList: Int*) = new MyIntList(numList)
}

object client extends App{
  
  println(MyIntList(1,2,3,4,5).myfilter(x => x > 2))
  
}