package com.tanze.app.modules.countryselection.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class CountrySelectionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhereareyouf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_are_you_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectYourCou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_your_cou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKenya: String? = MyApp.getInstance().resources.getString(R.string.lbl_kenya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUganda: String? = MyApp.getInstance().resources.getString(R.string.lbl_uganda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTanzania: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanzania)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEthiopia: String? = MyApp.getInstance().resources.getString(R.string.lbl_ethiopia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRwanda: String? = MyApp.getInstance().resources.getString(R.string.lbl_rwanda)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurundi: String? = MyApp.getInstance().resources.getString(R.string.lbl_burundi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_sudan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNigeria: String? = MyApp.getInstance().resources.getString(R.string.lbl_nigeria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSouthAfrica: String? = MyApp.getInstance().resources.getString(R.string.lbl_south_africa)

)
