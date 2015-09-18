package com.scala.examples

/**
 * @author rashmitr
 */

object FunctionByArgs {

  def compute(fun:(Int, Int) => Int, n1: Int, n2: Int): Int = fun(n1,n2)
  val add = (n1 :Int, n2: Int) => n1 + n2

  def main(args: Array[String]) {

    println(compute(add,1,2))
  }

}