package com.tanze.app.modules.quizleveloneone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tanze.app.R
import com.tanze.app.databinding.RowGridlockThreeBinding
import com.tanze.app.modules.quizleveloneone.`data`.model.GridlockThreeRowModel
import kotlin.Int
import kotlin.collections.List

class GridlockThreeAdapter(
  var list: List<GridlockThreeRowModel>
) : RecyclerView.Adapter<GridlockThreeAdapter.RowGridlockThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridlockThreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridlock_three,parent,false)
    return RowGridlockThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowGridlockThreeVH, position: Int) {
    val gridlockThreeRowModel = GridlockThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val gridlockThreeRowModel = list[position]
    holder.binding.gridlockThreeRowModel = gridlockThreeRowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridlockThreeRowModel>) {
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
      item: GridlockThreeRowModel
    ) {
    }
  }

  inner class RowGridlockThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridlockThreeBinding = RowGridlockThreeBinding.bind(itemView)
  }
}
