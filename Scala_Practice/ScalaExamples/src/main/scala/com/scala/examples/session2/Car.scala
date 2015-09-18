package com.scala.examples.session2


class Car(val year: Int) {
  
  private var milesDriven: Int = 0
  def miles() = milesDriven
  def drive(distance: Int) = milesDriven += Math.abs(distance)
  
  
  
}


object Car{
  
   def main(args: Array[String]): Unit = {
    val car = new Car(220)

    car.drive(200)

    println(car miles)
    
    
  }
  
}

