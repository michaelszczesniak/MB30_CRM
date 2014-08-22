package model

import java.util.Date
import play.api.libs.functional.syntax._
import play.api.libs.json._

/**
 * Created by work on 7/17/14.
 */
case class Encounter (encounter_id: Int, ibo_id: Int, prospect_id: Int, encounter_date: Date, encounter_notes: String)

trait EncounterTrait {

  implicit val readEncounter: Reads[Encounter] = (
    (__ \ ModelConstants.ENCOUNTER_ID).read[Int] and
      (__ \ ModelConstants.IBO_ID).read[Int] and
      (__ \ ModelConstants.PROSPECT_ID).read[Int] and
      (__ \ ModelConstants.ENCOUNTER_DATE).read[Date] and
      (__ \ ModelConstants.ENCOUNTER_NOTES).read[String]
    )(Encounter)

  implicit val writeEncounter: Writes[Encounter] = (
    (__ \ ModelConstants.ENCOUNTER_ID).write[Int] and
      (__ \ ModelConstants.IBO_ID).write[Int] and
      (__ \ ModelConstants.PROSPECT_ID).write[Int] and
      (__ \ ModelConstants.ENCOUNTER_DATE).write[Date] and
      (__ \ ModelConstants.ENCOUNTER_NOTES).write[String]
    )(unlift(Encounter.unapply))

}
