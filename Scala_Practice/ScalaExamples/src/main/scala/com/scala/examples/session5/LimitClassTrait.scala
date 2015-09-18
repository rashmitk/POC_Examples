package com.scala.examples.session5

//mixin of trait is possible with only those classes who share the same superclass


class AuthenticateUser

class GuestUser 

trait OnlineShopping extends AuthenticateUser {
  def buy() = println("Buy the products")
}

class Buyer extends AuthenticateUser with OnlineShopping
