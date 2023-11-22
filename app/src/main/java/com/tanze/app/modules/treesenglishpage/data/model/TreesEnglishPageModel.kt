package com.tanze.app.modules.treesenglishpage.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class TreesEnglishPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCanyouguessw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_can_you_guess_w)

)
