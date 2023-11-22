package com.tanze.app.modules.leaderboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityLeaderboardBinding
import com.tanze.app.modules.leaderboard.`data`.viewmodel.LeaderboardVM
import kotlin.String
import kotlin.Unit

class LeaderboardActivity : BaseActivity<ActivityLeaderboardBinding>(R.layout.activity_leaderboard)
    {
  private val viewModel: LeaderboardVM by viewModels<LeaderboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.leaderboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LEADERBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LeaderboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
