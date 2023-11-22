package com.tanze.app.modules.leaderboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tanze.app.modules.leaderboard.`data`.model.LeaderboardModel
import org.koin.core.KoinComponent

class LeaderboardVM : ViewModel(), KoinComponent {
  val leaderboardModel: MutableLiveData<LeaderboardModel> = MutableLiveData(LeaderboardModel())

  var navArguments: Bundle? = null
}
