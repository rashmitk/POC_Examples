package com.scala.examples.session3

object FoldingList {

  def main(args: Array[String]): Unit = {
    
    println((List(20,10,30).foldLeft(0)((acc,e) => {println("acc:"+acc+" e:"+e);e - acc})))
    println("\n")
    println((List(20,10,30).foldRight(0)((e, acc) => {println("acc:"+acc+" e:"+e);e - acc})))
  }
}