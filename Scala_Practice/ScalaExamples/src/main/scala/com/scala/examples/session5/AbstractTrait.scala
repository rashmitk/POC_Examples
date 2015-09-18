package com.scala.examples.session5

trait Tail {
  def wagTail = println("Tail is wagging")
}

abstract class Pet(name : String){
  def speak // abstract method
  def ownerIsHome = println("Get excited") //concrete method
  def reactionOfJoy = println("Jumping with joy")
}

class Dog(name:String) extends Pet(name) with Tail{
  override def speak = println("Whoofff")
  override def reactionOfJoy = println("Woww.. Master is home")
  override def ownerIsHome = {
    speak
    wagTail
    reactionOfJoy
    
  }
}

class Cat(name:String) extends Pet(name) with Tail{
  override def speak = println("Meoww")
  override def reactionOfJoy = println("I dont care..")
  override def ownerIsHome = {
    speak
    reactionOfJoy  
    
  }
}

object TraitClient3 extends App{
  val objD = new Dog("Tiger")
  val objC = new Cat("Mishti")
  
  objD.ownerIsHome
  println("\n\n")
  objC.ownerIsHome
  
  
}