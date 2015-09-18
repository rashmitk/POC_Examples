package com.scala.examples.session2

/**
 * @author rashmitr
 */
object HOFAsArgCountries {

  def computeValue(countryList: List[String], countrySelector: String => String) = {
    countryList foreach { x => println(countrySelector(x)) }

  }

  def main(args: Array[String]): Unit = {
    val countryList = List("India", "Australia", "USA", "France", "Italy", "GERMANY", "Czech Republic", "CHINA", "NEPAL")

    computeValue(countryList, { country => if (country == country.toUpperCase()) country else "---" })

    println("---------------------------------------------")
    computeValue(countryList, { country => if (country.length() > 4) country else "---" })
    println("---------------------------------------------")

    computeValue(countryList, { country => country.toUpperCase() })
    println("---------------------------------------------")
    computeValue(countryList, { country => country.substring(0, 2) })
  }

}