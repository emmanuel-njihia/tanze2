package com.tanze.app.modules.quizlevelone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityQuizLevelOneBinding
import com.tanze.app.modules.quizlevelone.`data`.model.QuizLevelOneRowModel
import com.tanze.app.modules.quizlevelone.`data`.viewmodel.QuizLevelOneVM
import com.tanze.app.modules.treesenglishpage.ui.TreesEnglishPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class QuizLevelOneActivity :
    BaseActivity<ActivityQuizLevelOneBinding>(R.layout.activity_quiz_level_one) {
  private val viewModel: QuizLevelOneVM by viewModels<QuizLevelOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val quizLevelOneAdapter =
    QuizLevelOneAdapter(viewModel.quizLevelOneList.value?:mutableListOf())
    binding.recyclerQuizLevelOne.adapter = quizLevelOneAdapter
    quizLevelOneAdapter.setOnItemClickListener(
    object : QuizLevelOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : QuizLevelOneRowModel) {
        onClickRecyclerQuizLevelOne(view, position, item)
      }
    }
    )
    viewModel.quizLevelOneList.observe(this) {
      quizLevelOneAdapter.updateData(it)
    }
    binding.quizLevelOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSixty.setOnClickListener {
      val destIntent = TreesEnglishPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSixtyThree.setOnClickListener {
      val destIntent = TreesEnglishPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerQuizLevelOne(
    view: View,
    position: Int,
    item: QuizLevelOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "QUIZ_LEVEL_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, QuizLevelOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
