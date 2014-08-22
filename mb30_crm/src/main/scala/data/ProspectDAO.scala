package data

import java.sql.DriverManager

import org.slf4j.LoggerFactory

/**
 * Created by work on 7/17/14.
 */
class ProspectDAO private(connString: String) {

  private val logger = LoggerFactory.getLogger(ProspectDAO.this.getClass)
  val conn = DriverManager.getConnection(connString)


}

object ProspectDAO {

  val dao = null

  def getInstance(connString: String) = {
    dao match {
      case null => new ProspectDAO(connString)
      case _ => dao
    }
  }
}