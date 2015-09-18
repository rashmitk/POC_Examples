package com.scala.examples


object CallByName1 {

   def time() = {
      println("Getting time in nano seconds")
      System.nanoTime
   }
   def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
      t
   }
   
   def notDelayed(t: Long) = {
     println("In not delayed")
   }
   
      def main(args: Array[String]) {
        delayed(time());
        println("-----------------")
        notDelayed(time())
   }

}