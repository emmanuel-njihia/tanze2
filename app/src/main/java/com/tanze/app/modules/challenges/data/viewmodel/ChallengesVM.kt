package com.tanze.app.modules.challenges.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.challenges.`data`.model.ChallengesModel
import org.koin.core.KoinComponent

class ChallengesVM : ViewModel(), KoinComponent {
  val challengesModel: MutableLiveData<ChallengesModel> = MutableLiveData(ChallengesModel())

  var navArguments: Bundle? = null
}
