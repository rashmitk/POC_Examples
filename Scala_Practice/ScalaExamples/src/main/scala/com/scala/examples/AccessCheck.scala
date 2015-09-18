package com.scala.examples

/**
 * @author rashmitr
 */
class AccessCheck {
  def start() = println("Started")
  def stop() = println("Stopped")
  private def increaseHeat() = println("Increasing heat")
}

object AccessCheck{
  
  def main(args: Array[String]): Unit = {
    val obj = new AccessCheck
    
    obj.start()
    obj.stop()
    obj.increaseHeat()
  }
}

/*
object Other{
  def main(args: Array[String]): Unit = {
    val obj = new AccessCheck
    
    obj.start()
    obj.stop()
    obj.increaseHeat()
    
  }
}
*/