package com.tanze.app.modules.challenges.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityChallengesBinding
import com.tanze.app.modules.activities.ui.ActivitiesActivity
import com.tanze.app.modules.challenges.`data`.viewmodel.ChallengesVM
import com.tanze.app.modules.quizlevelone.ui.QuizLevelOneActivity
import kotlin.String
import kotlin.Unit

class ChallengesActivity : BaseActivity<ActivityChallengesBinding>(R.layout.activity_challenges) {
  private val viewModel: ChallengesVM by viewModels<ChallengesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.challengesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etGroupThirtyEight.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCreateAChallenge.setOnClickListener {
      val destIntent = QuizLevelOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleSixtyFour.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewRectangleSixtyThree.setOnClickListener {
      val destIntent = ActivitiesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CHALLENGES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChallengesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
