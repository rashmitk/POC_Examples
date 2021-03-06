package models.database

import scala.slick.driver.MySQLDriver.simple._

case class Department(id: Option[Long], name: String)

class Departments(tag: Tag) extends Table[Department](tag, "DEPARTMENT") {
  
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name")

  def * = (id.?, name) <> (Department.tupled, Department.unapply _)
} 
