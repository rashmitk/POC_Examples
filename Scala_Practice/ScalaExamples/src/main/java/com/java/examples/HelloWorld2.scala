package com.java.examples

import com.scala.examples.ConsTest

object HelloWorld2 {
  
  def compute = 1 + 1
  
  def main(args: Array[String]): Unit = {
    println(compute)
    
    ConsTest.getInstance();
  }

}