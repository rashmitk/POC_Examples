package com.scala.examples.session2

class Person(name: String, age:Int) {
  
  def this(name: String, age:Int, company:String){
  this(name, age)
  }
  
  def this(n:String, a:Int, b:Int, c:Int){
    this("abc",10)
  }
  
  

}

object Person{
  
  def main(args: Array[String]): Unit = {
    val p1 = new Person("P1",29)
    val p2 = new Person("P1",29,"Cybage")
    
  }
}