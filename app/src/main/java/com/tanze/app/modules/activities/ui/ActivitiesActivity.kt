package com.tanze.app.modules.activities.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityActivitiesBinding
import com.tanze.app.modules.activities.`data`.viewmodel.ActivitiesVM
import com.tanze.app.modules.challengesone.ui.ChallengesOneActivity
import kotlin.String
import kotlin.Unit

class ActivitiesActivity : BaseActivity<ActivityActivitiesBinding>(R.layout.activity_activities) {
  private val viewModel: ActivitiesVM by viewModels<ActivitiesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.activitiesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackButton.setOnClickListener {
      val destIntent = ChallengesOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = ChallengesOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ACTIVITIES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ActivitiesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
