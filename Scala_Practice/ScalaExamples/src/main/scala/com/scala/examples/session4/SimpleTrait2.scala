package com.scala.examples.session4

trait Vehicle {
  //def drive = "Driving"
  def race:String
}

trait Car extends Vehicle {
  override def race = "Racing the car"
}

trait Boat extends Vehicle {
  //override def drive = "boat is floating"
  override def race = "Racing boat"
}

class MyVehicle1 extends Car with Boat
class MyVehicle2 extends Boat with Car

object VehicleClient extends App{
  
  val v1 = new MyVehicle1
  val v2 = new MyVehicle2
  
  println(v1.race)
  println(v2.race)
  
  
}
  


