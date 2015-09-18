package com.scala.examples.session4

class Shirt private (val size: String) {
  override def toString(): String = "Chosen shirt size : " + size
}


object Shirt {
  private val availableSizes = Map(
    "S" -> new Shirt("SMALL"),
    "M" -> new Shirt("MEDIUM"),
    "L" -> new Shirt("LARGE"))

    def availbleSizes = "S, M, L"
  
    def apply(size: String) = if (availableSizes.contains(size)) availableSizes(size) else null
}


object ShirtClient extends App{
  
  println("Available shirt sizes : "+Shirt.availbleSizes)
  
  println("\n")
  
  println(Shirt("S"))
  println(Shirt("M"))
  println(Shirt("L"))

}