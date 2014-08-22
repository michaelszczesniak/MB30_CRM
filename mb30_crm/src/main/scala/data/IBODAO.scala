package data

import java.sql.DriverManager

import org.slf4j.LoggerFactory

/**
 * Created by work on 7/17/14.
 */
class IBODAO private(connString: String) {

  private val logger = LoggerFactory.getLogger(IBODAO.this.getClass)
  val conn = DriverManager.getConnection(connString)

  def get = {

  }

}

object IBODAO {

  val dao = null

  def getInstance(connString: String) = {
    dao match {
      case null => new IBODAO(connString)
      case _ => dao
    }
  }
}