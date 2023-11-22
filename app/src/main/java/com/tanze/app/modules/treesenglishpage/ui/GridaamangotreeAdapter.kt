package com.tanze.app.modules.treesenglishpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tanze.app.R
import com.tanze.app.databinding.RowGridaamangotreeBinding
import com.tanze.app.modules.treesenglishpage.`data`.model.GridaamangotreeRowModel
import kotlin.Int
import kotlin.collections.List

class GridaamangotreeAdapter(
  var list: List<GridaamangotreeRowModel>
) : RecyclerView.Adapter<GridaamangotreeAdapter.RowGridaamangotreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridaamangotreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridaamangotree,parent,false)
    return RowGridaamangotreeVH(view)
  }

  override fun onBindViewHolder(holder: RowGridaamangotreeVH, position: Int) {
    val gridaamangotreeRowModel = GridaamangotreeRowModel()
    // TODO uncomment following line after integration with data source
    // val gridaamangotreeRowModel = list[position]
    holder.binding.gridaamangotreeRowModel = gridaamangotreeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridaamangotreeRowModel>) {
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
      item: GridaamangotreeRowModel
    ) {
    }
  }

  inner class RowGridaamangotreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridaamangotreeBinding = RowGridaamangotreeBinding.bind(itemView)
    init {
      binding.linearColumnaamangotree.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, GridaamangotreeRowModel())
      }
    }
  }
}
