package com.scala.examples.session3

object MapAndForeach {
  def main(args: Array[String]): Unit = {

    (1 to 4).map(num => "Happy Birthday "+(if(num == 3) "dear Name" else "to you")).foreach(println _)
    
  }

}