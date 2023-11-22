package com.tanze.app.modules.rightanswerone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityRightAnswerOneBinding
import com.tanze.app.modules.rightanswerone.`data`.viewmodel.RightAnswerOneVM
import com.tanze.app.modules.treesenglishpage.ui.TreesEnglishPageActivity
import kotlin.String
import kotlin.Unit

class RightAnswerOneActivity :
    BaseActivity<ActivityRightAnswerOneBinding>(R.layout.activity_right_answer_one) {
  private val viewModel: RightAnswerOneVM by viewModels<RightAnswerOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.rightAnswerOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnTryAgain.setOnClickListener {
      val destIntent = TreesEnglishPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "RIGHT_ANSWER_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RightAnswerOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
