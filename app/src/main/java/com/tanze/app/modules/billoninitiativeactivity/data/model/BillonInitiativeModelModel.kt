package com.tanze.app.modules.billoninitiativeactivity.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class BillonInitiativeModelModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKiambuKidsIn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kiambu_kid_s_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_you_created_thi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdamand4more: String? =
      MyApp.getInstance().resources.getString(R.string.msg_adam_and_4_more)

)
