package com.scala.examples.session3

import java.util.ArrayList

/**
 * @author rashmitr
 */
class Person5(val id:Int, var name:String) {
  
  def update(i:Int, n:String) = {
    
      if(i==id){ name = n;
           println("Name updated successfully")} 
      else 
        println("Invalid Id, Update can't be done")
    
  }
}

object Person5 extends App{
  
  val p1 = new Person5(1,"Rashmit")
  
  println(p1.id+" "+p1.name)
  p1(1) = "Akash"
  println(p1.id+" "+p1.name)
  
}