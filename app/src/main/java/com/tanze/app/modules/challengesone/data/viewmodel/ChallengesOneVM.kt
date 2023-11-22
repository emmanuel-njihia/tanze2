package com.tanze.app.modules.challengesone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.challengesone.`data`.model.ChallengesOneModel
import org.koin.core.KoinComponent

class ChallengesOneVM : ViewModel(), KoinComponent {
  val challengesOneModel: MutableLiveData<ChallengesOneModel> =
      MutableLiveData(ChallengesOneModel())

  var navArguments: Bundle? = null
}
