package com.tanze.app.modules.quizlevelone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tanze.app.R
import com.tanze.app.databinding.RowQuizLevelOneBinding
import com.tanze.app.modules.quizlevelone.`data`.model.QuizLevelOneRowModel
import kotlin.Int
import kotlin.collections.List

class QuizLevelOneAdapter(
  var list: List<QuizLevelOneRowModel>
) : RecyclerView.Adapter<QuizLevelOneAdapter.RowQuizLevelOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowQuizLevelOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_quiz_level_one,parent,false)
    return RowQuizLevelOneVH(view)
  }

  override fun onBindViewHolder(holder: RowQuizLevelOneVH, position: Int) {
    val quizLevelOneRowModel = QuizLevelOneRowModel()
    // TODO uncomment following line after integration with data source
    // val quizLevelOneRowModel = list[position]
    holder.binding.quizLevelOneRowModel = quizLevelOneRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<QuizLevelOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: QuizLevelOneRowModel
    ) {
    }
  }

  inner class RowQuizLevelOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowQuizLevelOneBinding = RowQuizLevelOneBinding.bind(itemView)
  }
}
