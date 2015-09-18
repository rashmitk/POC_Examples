package com.scala.examples.session5

trait AA { def f: Int }

trait BB extends AA { def f: Int = 1 ; def g: Int = 2 ; def h: Int = 3 }

trait CC extends AA { override def f: Int = 4 ; def g: Int }

trait DD extends BB with CC { def h: Int }