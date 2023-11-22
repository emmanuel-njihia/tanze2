package com.tanze.app.modules.landingpagemain.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityLandingPageMainBinding
import com.tanze.app.modules.activities.ui.ActivitiesActivity
import com.tanze.app.modules.challenges.ui.ChallengesActivity
import com.tanze.app.modules.landingpagemain.`data`.viewmodel.LandingPageMainVM
import com.tanze.app.modules.quizleveloneone.ui.QuizLevelOneOneActivity
import com.tanze.app.modules.signup.ui.SignUpActivity
import kotlin.String
import kotlin.Unit

class LandingPageMainActivity :
    BaseActivity<ActivityLandingPageMainBinding>(R.layout.activity_landing_page_main) {
  private val viewModel: LandingPageMainVM by viewModels<LandingPageMainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageMainVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearGame1.setOnClickListener {
      val destIntent = QuizLevelOneOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBackButton.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackvectorthree.setOnClickListener {
      val destIntent = ChallengesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowactivities.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LANDING_PAGE_MAIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LandingPageMainActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
