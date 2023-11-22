package com.tanze.app.modules.treesenglishpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tanze.app.R
import com.tanze.app.appcomponents.base.BaseActivity
import com.tanze.app.databinding.ActivityTreesEnglishPageBinding
import com.tanze.app.modules.rightanswer.ui.RightAnswerActivity
import com.tanze.app.modules.rightanswerone.ui.RightAnswerOneActivity
import com.tanze.app.modules.specifictreeinfo.ui.SpecificTreeInfoActivity
import com.tanze.app.modules.treesenglishpage.`data`.model.GridaamangotreeRowModel
import com.tanze.app.modules.treesenglishpage.`data`.viewmodel.TreesEnglishPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TreesEnglishPageActivity :
    BaseActivity<ActivityTreesEnglishPageBinding>(R.layout.activity_trees_english_page) {
  private val viewModel: TreesEnglishPageVM by viewModels<TreesEnglishPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridaamangotreeAdapter =
    GridaamangotreeAdapter(viewModel.gridaamangotreeList.value?:mutableListOf())
    binding.recyclerGridaamangotree.adapter = gridaamangotreeAdapter
    gridaamangotreeAdapter.setOnItemClickListener(
    object : GridaamangotreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridaamangotreeRowModel) {
        onClickRecyclerGridaamangotree(view, position, item)
      }
    }
    )
    viewModel.gridaamangotreeList.observe(this) {
      gridaamangotreeAdapter.updateData(it)
    }
    binding.treesEnglishPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetSomeHints.setOnClickListener {
      val destIntent = SpecificTreeInfoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerGridaamangotree(
    view: View,
    position: Int,
    item: GridaamangotreeRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnaamangotree ->  {
        onClickRecyclerGridaamangotreeLinearColumnaamangotree(view, position, item)
      }
    }
  }

  fun onClickRecyclerGridaamangotreeLinearColumnaamangotree(
    view: View,
    position: Int,
    item: GridaamangotreeRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = RightAnswerOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 ->  {
        val destIntent = RightAnswerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 ->  {
        val destIntent = RightAnswerOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 ->  {
        val destIntent = RightAnswerOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "TREES_ENGLISH_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TreesEnglishPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
