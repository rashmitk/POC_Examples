package com.scala.examples.session5


class PizzaHutEmployee

class CorporateEmp extends PizzaHutEmployee
class StoreEmp extends PizzaHutEmployee



trait DeliverThePizaa {
  this:StoreEmp=> {
      def deliverPizza = println("Pizza delivery")
      }
}

trait OtherTrait{
  this: {def hello:Unit}=>
}

class NewJoinees extends StoreEmp with DeliverThePizaa


class C {
  def hello = print("") 
}

class D extends C with OtherTrait{
  
}


