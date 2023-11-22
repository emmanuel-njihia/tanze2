package com.tanze.app.modules.challenges.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class ChallengesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChallengesfor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_challenges_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyEightValue: String? = null
)
