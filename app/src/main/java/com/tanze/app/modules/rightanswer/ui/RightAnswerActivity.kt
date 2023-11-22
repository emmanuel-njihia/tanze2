package com.tanze.app.modules.rightanswer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityRightAnswerBinding
import com.tanze.app.modules.rightanswer.`data`.viewmodel.RightAnswerVM
import kotlin.String
import kotlin.Unit

class RightAnswerActivity : BaseActivity<ActivityRightAnswerBinding>(R.layout.activity_right_answer)
    {
  private val viewModel: RightAnswerVM by viewModels<RightAnswerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rightAnswerVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RIGHT_ANSWER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RightAnswerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
