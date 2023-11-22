package com.tanze.app.modules.treesenglishpage.`data`.model

import com.tanze.app.R
import com.tanze.app.appcomponents.di.MyApp
import kotlin.String

data class GridaamangotreeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAAMangotree: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_a_mango_tree)

)
