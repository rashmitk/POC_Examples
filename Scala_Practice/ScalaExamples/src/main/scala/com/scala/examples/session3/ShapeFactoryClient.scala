package com.scala.examples.session3

object ShapeFactoryClient {
  def main(args: Array[String]): Unit = {

    val shape = ShapeFactory.getShape("Circle")
    println(shape.draw())
  }
}

