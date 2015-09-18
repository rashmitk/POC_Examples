package com.scala.examples.session5


abstract class McDonaldEmployee

class StoreEmployee extends McDonaldEmployee 
class CorporateEmployee extends McDonaldEmployee

trait DeliverPizza extends StoreEmployee

class DeliveryBoy1 extends DeliverPizza

//class DeliveryBoy2 extends CorporateEmployee with DeliverPizza

