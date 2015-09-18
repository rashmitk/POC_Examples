package com.scala.examples.session2

/**
 * @author rashmitr
 */

//class Book( val title:String)
//class Book( var title:String)

/*
class Book(private var title: String) {
def printTitle {println(title)}
}
*/

//class Book(title: String)
//val book = new Book("Beginning Scala")
//book.printTitle(new Book("Beginning Erlang"))

/*
class Book(title: String) {
  def printTitle(b: Book) {
   // println(b.title)
    println(title)
  }
}
*/


class Book(title: String) {
def printTitle(b: Book) {
//println(b.title)
  println(title)
}
}


/*
 * public Book{
 * private title;
 * 
 * private String getTitle(){}
 * //private void getTitle(String title){}
 * 
 * }
 * 
 * 
 * */

/*
object Client{
  def main(args: Array[String]): Unit = {
    val objBook = new Book("Beginning Scala")
    //objBook.printTitle(new Book("Programming in Scala"))
    //objBook.title = "Programming in Scala"
    //println(objBook.title)
  }
}
* */

