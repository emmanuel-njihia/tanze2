package com.tanze.app.modules.selectlanguage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.selectlanguage.`data`.model.SelectLanguageModel
import org.koin.core.KoinComponent

class SelectLanguageVM : ViewModel(), KoinComponent {
  val selectLanguageModel: MutableLiveData<SelectLanguageModel> =
      MutableLiveData(SelectLanguageModel())

  var navArguments: Bundle? = null
}
