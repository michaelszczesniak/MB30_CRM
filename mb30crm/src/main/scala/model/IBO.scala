package model

import java.util.Date
import play.api.libs.functional.syntax._
import play.api.libs.json._

/**
 * Created by work on 7/17/14.
 */
case class IBO (ibo_id: Int, ibo_username: String, ibo_password: String, ibo_name: String, ibo_phone: String, ibo_email: String)

trait IBOTrait {

  implicit val readIBO: Reads[IBO] = (
    (__ \ ModelConstants.IBO_ID).read[Int] and
      (__ \ ModelConstants.IBO_USERNAME).read[String] and
      (__ \ ModelConstants.IBO_PASSWORD).read[String] and
      (__ \ ModelConstants.IBO_NAME).read[String]and
      (__ \ ModelConstants.IBO_PHONE).read[String] and
      (__ \ ModelConstants.IBO_EMAIL).read[String]
    )(IBO)

  implicit val writeIBO: Writes[IBO] = (
    (__ \ ModelConstants.IBO_ID).write[Int] and
      (__ \ ModelConstants.IBO_USERNAME).write[String] and
      (__ \ ModelConstants.IBO_PASSWORD).write[String] and
      (__ \ ModelConstants.IBO_NAME).write[String]and
      (__ \ ModelConstants.IBO_PHONE).write[String] and
      (__ \ ModelConstants.IBO_EMAIL).write[String]
    )(unlift(IBO.unapply))

}