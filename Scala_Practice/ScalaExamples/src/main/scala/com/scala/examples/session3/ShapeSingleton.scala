package com.scala.examples.session3

/**
 * @author rashmitr
 */
trait Shape {
  def draw(): String
}

class Rectangle extends Shape {
  override def draw() = "Drawing rectangle"
}

class Square extends Shape {
  override def draw() = "Drawing square"
}

class Circle extends Shape {
  override def draw() = "Drawing circle"
}



