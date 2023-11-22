package com.tanze.app.modules.homepage.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTanze: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanze)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAClimatechan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_climate_chan)

)
