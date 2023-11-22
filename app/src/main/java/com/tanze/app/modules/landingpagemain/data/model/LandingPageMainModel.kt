package com.tanze.app.modules.landingpagemain.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class LandingPageMainModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReadySetGo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ready_set_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDoyouknowthe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_you_know_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPractice: String? = MyApp.getInstance().resources.getString(R.string.lbl_practice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtActivities: String? = MyApp.getInstance().resources.getString(R.string.lbl_activities)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChallenges: String? = MyApp.getInstance().resources.getString(R.string.lbl_challenges)

)
