package com.tanze.app.modules.leaderboard.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class LeaderboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLittleJeremy: String? = MyApp.getInstance().resources.getString(R.string.lbl_little_jeremy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGraceyGrace: String? = MyApp.getInstance().resources.getString(R.string.lbl_gracey_grace)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_18_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKimmieNjeri: String? = MyApp.getInstance().resources.getString(R.string.lbl_kimmie_njeri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_17_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVictorOdhiambo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_victor_odhiambo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounterThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_15_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJaneyPatel: String? = MyApp.getInstance().resources.getString(R.string.lbl_janey_patel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounterFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_12_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArkCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_ark_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPointsCounterFive: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_11_points)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineValue: String? = null
)
