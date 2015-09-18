package models.database

import scala.slick.driver.MySQLDriver.simple._
import play.api.db.DB
import play.api.Play.current

//case class Employee(id: Long, name: String, dept_id: Long, manager_id: Long, isManager: Boolean)

class Employees(tag: Tag) extends Table[(Long, String, Long, Long, Boolean)](tag, "EMPLOYEE") {

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name")
  def dept_id = column[Long]("dept_id")
  def manager_id = column[Long]("manager_id")
  def isManager = column[Boolean]("isManager")
  def * = (id, name, dept_id, manager_id, isManager)
}

object EmployeeUtil {

  def setup {
    val employees1 = TableQuery[Employees]

    Database.forURL("jdbc:mysql://localhost/slick", "root", "admin", driver = "com.mysql.jdbc.Driver") withSession {
      implicit session =>
        (employees1.ddl).create
    }
  }

  def insertEmployees {
    Database.forURL("jdbc:mysql://localhost/slick", "root", "admin", driver = "com.mysql.jdbc.Driver") withSession {
      implicit session =>
        val employees2 = TableQuery[Employees]
        employees2.insert(1, "Sumit",1,1,true)
        employees2.insert(2, "Rashmit",2,2,true)
        employees2.insert(3, "Vijeta",3,3,false)
        employees2.insert(4, "Gaurang",4,4,false)
    }
  }
  
  
  def getEmployees {
    Database.forURL("jdbc:mysql://localhost/slick", "root", "admin", driver = "com.mysql.jdbc.Driver") withSession {
      implicit session =>

        val employees3 = TableQuery[Employees]

        employees3 foreach {
          case (id, name, dept_id, manager_id, isManager) =>
            println("ID: "+id+" Name: " + name + " DeptID : " + dept_id+" managerID:"+manager_id+" isManager"+isManager)
        }
    }
  }
}


