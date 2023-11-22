package com.tanze.app.modules.treesenglishpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.treesenglishpage.`data`.model.GridaamangotreeRowModel
import com.tanze.app.modules.treesenglishpage.`data`.model.TreesEnglishPageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TreesEnglishPageVM : ViewModel(), KoinComponent {
  val treesEnglishPageModel: MutableLiveData<TreesEnglishPageModel> =
      MutableLiveData(TreesEnglishPageModel())

  var navArguments: Bundle? = null

  val gridaamangotreeList: MutableLiveData<MutableList<GridaamangotreeRowModel>> =
      MutableLiveData(mutableListOf())
}
