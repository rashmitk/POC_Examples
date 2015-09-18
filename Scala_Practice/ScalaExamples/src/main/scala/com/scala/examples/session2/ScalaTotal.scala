package com.scala.examples.session2
import scala.collection.immutable.List


object ScalaTotal {

 def doTotal(l : List[Int]) = l.foldLeft(0)((accumulator, elem) =>accumulator + elem)  
 
 def main(args: Array[String]): Unit = {
   println(doTotal(List(1,2,3,4,5)))
 }
  
}