package com.tanze.app.modules.rightanswertwo.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class RightAnswerTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddPhotosoft: String? =
      MyApp.getInstance().resources.getString(R.string.msg_add_photos_of_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyOneValue: String? = null
)
