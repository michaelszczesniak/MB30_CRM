package service

import org.slf4j.LoggerFactory
import data.{EncounterDAO, ProspectDAO, IBODAO}
import model.{IBO, Prospect}

/**
 * Created by work on 8/15/14.
 */
class CRUDService {

  private val logger = LoggerFactory.getLogger(CRUDService.this.getClass)

  private val connString = ConfigPaths.getConnString

  lazy val encounterDAO = EncounterDAO.getInstance(connString)
  lazy val iboDAO = IBODao.getInstance(connString)
  lazy val prospectDAO = ProspectDAO.getInstance(connString)

  val encounterList = encounterDAO.get
  val iboList = iboDAO.get
  val prospectList = prospectDAO.get

  //GETTERS BY ID
  def getIBOById(id: Int): IBO = {null}

  def getProspectById(id: Int): Prospect = {null}

  //IBO CRUD
  def createIBO: Boolean = {false}

  def updateIBO: Boolean = {false}

  def deleteIBO: Boolean = {false}

  //ENCOUNTER CRUD
  def createEncounter: Boolean = {false}

  def updateEncounter: Boolean = {false}

  def deleteEncounter: Boolean = {false}

  //PROSPECT CRUD
  def createProspect: Boolean = {false}

  def updateProspect: Boolean = {false}

  def deleteProspect: Boolean = {false}

}
