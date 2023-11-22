package com.tanze.app.modules.selectlanguage.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class SelectLanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_jambo_hello_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectYourPre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_your_pre)

)
