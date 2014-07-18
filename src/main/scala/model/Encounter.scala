package model

import java.util.Date

/**
 * Created by work on 7/17/14.
 */
case class Encounter (encounter_id: Int, ibo_id: Int, prospect_id: Int, encounter_date: Date, encounter_notes: String)

trait EncounterTrait {

}
