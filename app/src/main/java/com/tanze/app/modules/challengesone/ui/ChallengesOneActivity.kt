package com.tanze.app.modules.challengesone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityChallengesOneBinding
import com.tanze.app.modules.activities.ui.ActivitiesActivity
import com.tanze.app.modules.challengesone.`data`.viewmodel.ChallengesOneVM
import com.tanze.app.modules.landingpagemain.ui.LandingPageMainActivity
import kotlin.String
import kotlin.Unit

class ChallengesOneActivity :
    BaseActivity<ActivityChallengesOneBinding>(R.layout.activity_challenges_one) {
  private val viewModel: ChallengesOneVM by viewModels<ChallengesOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.challengesOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackButton.setOnClickListener {
      val destIntent = LandingPageMainActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleSeventyFive.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearColumnrectangleseventysix.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowshowyourtree.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHALLENGES_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChallengesOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
