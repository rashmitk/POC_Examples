package com.scala.examples

class Shape {
  def getArea = 0.0
}

class Rectangle(val height:Double, val width:Double) extends Shape{
  override def getArea = height * width 
}

class Circle(val radius:Int) extends Shape{
  override def getArea = Math.PI * radius * radius
}

object ShapeClient{
  def main(args : Array[String]){
    val objRectangle = new Rectangle(5,5)
    val objCircle = new Circle(10)
    
    println(objRectangle.getArea)
    println(objCircle.getArea)
  }
}
