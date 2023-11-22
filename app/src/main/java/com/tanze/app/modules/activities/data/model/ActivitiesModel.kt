package com.tanze.app.modules.activities.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class ActivitiesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivity: String? = MyApp.getInstance().resources.getString(R.string.lbl_activity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecordavideo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_record_a_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)
