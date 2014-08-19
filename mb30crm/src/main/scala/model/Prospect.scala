package model

import java.util.Date
import play.api.libs.functional.syntax._
import play.api.libs.json._

/**
 * Created by work on 7/17/14.
 */
case class Prospect (prospect_id: Int, prospect_name: String, prospect_email: String, prospect_phone: String, ibo_id: Int)

trait ProspectTrait {

  implicit val readProspect: Reads[Prospect] = (
    (__ \ ModelConstants.PROSPECT_ID).read[Int] and
      (__ \ ModelConstants.PROSPECT_NAME).read[String] and
      (__ \ ModelConstants.PROSPECT_EMAIL).read[String] and
      (__ \ ModelConstants.PROSPECT_PHONE).read[String]and
      (__ \ ModelConstants.IBO_ID).read[Int]
    )(Prospect)

  implicit val writeProspect: Writes[Prospect] = (
    (__ \ ModelConstants.PROSPECT_ID).write[Int] and
      (__ \ ModelConstants.PROSPECT_NAME).write[String] and
      (__ \ ModelConstants.PROSPECT_EMAIL).write[String] and
      (__ \ ModelConstants.PROSPECT_PHONE).write[String]and
      (__ \ ModelConstants.IBO_ID).write[Int]
    )(unlift(Prospect.unapply))

}