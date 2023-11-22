package com.tanze.app.modules.challengesone.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class ChallengesOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtActivitiesFor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_activities_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnaboutInd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_about_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowyourtree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_show_your_tree)

)
