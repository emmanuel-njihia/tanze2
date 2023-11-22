package com.tanze.app.modules.rightanswerone.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class RightAnswerOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOhnoYoucan: String? = MyApp.getInstance().resources.getString(R.string.msg_oh_no_you_can)

)
