package com.tanze.app.modules.createuserprofileone.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class CreateUserProfileOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYaaay: String? = MyApp.getInstance().resources.getString(R.string.lbl_yaaay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouearnedamo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_earned_a_mo)

)
