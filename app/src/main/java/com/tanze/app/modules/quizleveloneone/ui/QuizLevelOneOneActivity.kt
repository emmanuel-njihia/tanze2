package com.tanze.app.modules.quizleveloneone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityQuizLevelOneOneBinding
import com.tanze.app.modules.landingpagemain.ui.LandingPageMainActivity
import com.tanze.app.modules.quizleveloneone.`data`.model.GridlockThreeRowModel
import com.tanze.app.modules.quizleveloneone.`data`.viewmodel.QuizLevelOneOneVM
import com.tanze.app.modules.treesenglishpage.ui.TreesEnglishPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class QuizLevelOneOneActivity :
    BaseActivity<ActivityQuizLevelOneOneBinding>(R.layout.activity_quiz_level_one_one) {
  private val viewModel: QuizLevelOneOneVM by viewModels<QuizLevelOneOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridlockThreeAdapter =
    GridlockThreeAdapter(viewModel.gridlockThreeList.value?:mutableListOf())
    binding.recyclerGridlockThree.adapter = gridlockThreeAdapter
    gridlockThreeAdapter.setOnItemClickListener(
    object : GridlockThreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridlockThreeRowModel) {
        onClickRecyclerGridlockThree(view, position, item)
      }
    }
    )
    viewModel.gridlockThreeList.observe(this) {
      gridlockThreeAdapter.updateData(it)
    }
    binding.quizLevelOneOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBackButton.setOnClickListener {
      val destIntent = LandingPageMainActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixty.setOnClickListener {
      val destIntent = TreesEnglishPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridlockThree(
    view: View,
    position: Int,
    item: GridlockThreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "QUIZ_LEVEL_ONE_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuizLevelOneOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
