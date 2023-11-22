package com.tanze.app.modules.invitefriends.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class InviteFriendsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAdam: String? = MyApp.getInstance().resources.getString(R.string.lbl_adam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeatrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_beatrice)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCatherine: String? = MyApp.getInstance().resources.getString(R.string.lbl_catherine)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDanson: String? = MyApp.getInstance().resources.getString(R.string.lbl_danson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEsther: String? = MyApp.getInstance().resources.getString(R.string.lbl_esther)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFaith: String? = MyApp.getInstance().resources.getString(R.string.lbl_faith)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGeofferry: String? = MyApp.getInstance().resources.getString(R.string.lbl_geofferry)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyThreeValue: String? = null
)
