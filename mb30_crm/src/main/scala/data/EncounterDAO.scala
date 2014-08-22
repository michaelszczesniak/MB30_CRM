package data

import java.sql.DriverManager

import org.slf4j.LoggerFactory

/**
 * Created by work on 7/17/14.
 */
class EncounterDAO private(connString: String) {

  private val logger = LoggerFactory.getLogger(EncounterDAO.this.getClass)
  val conn = DriverManager.getConnection(connString)

}

object EncounterDAO {

  val dao = null

  def getInstance(connString: String) = {
    dao match {
      case null => new EncounterDAO(connString)
      case _ => dao
    }
  }
}