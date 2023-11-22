package com.tanze.app.modules.rightanswer.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class RightAnswerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCongratulationsOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItsaEucalyptu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_its_a_eucalyptu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouearnedane: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_earned_a_ne)

)
