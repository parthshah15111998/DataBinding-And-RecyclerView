package com.example.databindingandrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingandrecyclerview.databinding.RecyclerviewItemBinding

class Adapter(val taskList:List<Task>):RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: RecyclerviewItemBinding):RecyclerView.ViewHolder(binding.root){
        fun bindItem(task:Task){
            binding.tvTitle.text=task.title
            binding.tvTime.text=task.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindItem(taskList[position])
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}