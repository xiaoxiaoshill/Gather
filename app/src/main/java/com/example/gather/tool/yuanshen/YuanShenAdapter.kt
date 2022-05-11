package com.example.gather.tool.yuanshen

import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gather.R

class YuanShenAdapter(val yuanshenList: List<Yelement>) : RecyclerView.Adapter<YuanShenAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val icon:ImageView = view.findViewById(R.id.icon)
        val icontitle:TextView = view.findViewById(R.id.icontitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.yuanshen_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val yuanshen = yuanshenList[position]
        holder.icon.setImageResource(yuanshen.icon)
        holder.icontitle.text = yuanshen.title
    }

    override fun getItemCount() = yuanshenList.size
}

class Decoration : RecyclerView.ItemDecoration(){
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        if ((parent.getChildAdapterPosition(view)+1)%3 != 0){
            outRect.right = 5
        }
    }
}