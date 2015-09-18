package com.scala.examples.session4

object FoldingList {

  def main(args: Array[String]): Unit = {
    
    println((List(20,10,20).foldLeft(0)((acc,e) => {println("acc:"+acc+" e:"+e);e - acc})))
    println("\n")
    println((List(20,10,30).foldRight(0)((acc, e) => {println("acc:"+acc+" e:"+e);e - acc})))
  }
}