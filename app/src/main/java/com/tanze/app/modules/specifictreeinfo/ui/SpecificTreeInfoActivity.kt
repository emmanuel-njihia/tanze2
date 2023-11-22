package com.tanze.app.modules.specifictreeinfo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivitySpecificTreeInfoBinding
import com.tanze.app.modules.rightanswertwo.ui.RightAnswerTwoActivity
import com.tanze.app.modules.specifictreeinfo.`data`.viewmodel.SpecificTreeInfoVM
import com.tanze.app.modules.treesenglishpage.ui.TreesEnglishPageActivity
import kotlin.String
import kotlin.Unit

class SpecificTreeInfoActivity :
    BaseActivity<ActivitySpecificTreeInfoBinding>(R.layout.activity_specific_tree_info) {
  private val viewModel: SpecificTreeInfoVM by viewModels<SpecificTreeInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.specificTreeInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtShowtheworld.setOnClickListener {
      val destIntent = RightAnswerTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageAdd.setOnClickListener {
      val destIntent = RightAnswerTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRowisthistreefo.setOnClickListener {
      val destIntent = RightAnswerTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBackToQuiz.setOnClickListener {
      val destIntent = TreesEnglishPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBackButton.setOnClickListener {
      val destIntent = TreesEnglishPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPECIFIC_TREE_INFO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SpecificTreeInfoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
