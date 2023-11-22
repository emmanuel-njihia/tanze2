package com.tanze.app.modules.rightanswertwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityRightAnswerTwoBinding
import com.tanze.app.modules.quizlevelone.ui.QuizLevelOneActivity
import com.tanze.app.modules.rightanswertwo.`data`.viewmodel.RightAnswerTwoVM
import com.tanze.app.modules.specifictreeinfo.ui.SpecificTreeInfoActivity
import kotlin.String
import kotlin.Unit

class RightAnswerTwoActivity :
    BaseActivity<ActivityRightAnswerTwoBinding>(R.layout.activity_right_answer_two) {
  private val viewModel: RightAnswerTwoVM by viewModels<RightAnswerTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rightAnswerTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackButton.setOnClickListener {
      val destIntent = SpecificTreeInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSave.setOnClickListener {
      val destIntent = QuizLevelOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RIGHT_ANSWER_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RightAnswerTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
