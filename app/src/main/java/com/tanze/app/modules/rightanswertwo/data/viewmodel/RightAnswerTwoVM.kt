package com.tanze.app.modules.rightanswertwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.rightanswertwo.`data`.model.RightAnswerTwoModel
import org.koin.core.KoinComponent

class RightAnswerTwoVM : ViewModel(), KoinComponent {
  val rightAnswerTwoModel: MutableLiveData<RightAnswerTwoModel> =
      MutableLiveData(RightAnswerTwoModel())

  var navArguments: Bundle? = null
}
