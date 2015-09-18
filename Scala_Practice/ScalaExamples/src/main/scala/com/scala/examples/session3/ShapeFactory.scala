package com.scala.examples.session3

object ShapeFactory {
  def getShape(shape: String) = {
    shape match {
      case shape if shape == "Rectangle" => new Rectangle
      case shape if shape == "Square"    => new Square
      case shape if shape == "Circle"    => new Circle
    }
  }
}