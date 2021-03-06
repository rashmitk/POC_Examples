package models.database

import scala.slick.driver.MySQLDriver.simple._

case class Manager(id: Option[Long], emp_id: Long, dept_id: Long, reportee_id: Long)

class Managers(tag: Tag) extends Table[Manager](tag, "MANAGER") {
  
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def emp_id = column[Long]("emp_id")
  def dept_id = column[Long]("dept_id")
  def reportee_id = column[Long]("reportee_id")
  def * = (id.?, emp_id, dept_id, reportee_id) <> (Manager.tupled, Manager.unapply _)
} 
