package com.tanze.app.modules.signup.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJustalittleb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_just_a_little_b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonethisbefor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_done_this_befor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyEightValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySixValue: String? = null
)
