package com.tanze.app.modules.specifictreeinfo.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class SpecificTreeInfoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTheEucalyptus: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_eucalyptus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndegeousTree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_indegeous_tree)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFunFacts: String? = MyApp.getInstance().resources.getString(R.string.lbl_fun_facts)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_they_are_evergr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIsthistreefo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_is_this_tree_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShowtheworld: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_show_the_world)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhyIsthisTre: String? =
      MyApp.getInstance().resources.getString(R.string.msg_why_is_this_tre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAshortNarrati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_short_narrati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_from_this_narra)

)
