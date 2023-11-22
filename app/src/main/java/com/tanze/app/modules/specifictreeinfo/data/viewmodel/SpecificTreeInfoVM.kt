package com.tanze.app.modules.specifictreeinfo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.specifictreeinfo.`data`.model.SpecificTreeInfoModel
import org.koin.core.KoinComponent

class SpecificTreeInfoVM : ViewModel(), KoinComponent {
  val specificTreeInfoModel: MutableLiveData<SpecificTreeInfoModel> =
      MutableLiveData(SpecificTreeInfoModel())

  var navArguments: Bundle? = null
}
