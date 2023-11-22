package com.tanze.app.modules.rightanswerone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.rightanswerone.`data`.model.RightAnswerOneModel
import org.koin.core.KoinComponent

class RightAnswerOneVM : ViewModel(), KoinComponent {
  val rightAnswerOneModel: MutableLiveData<RightAnswerOneModel> =
      MutableLiveData(RightAnswerOneModel())

  var navArguments: Bundle? = null
}
