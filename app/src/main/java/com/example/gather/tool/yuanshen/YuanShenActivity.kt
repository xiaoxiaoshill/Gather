package com.example.gather.tool.yuanshen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.gather.R

class YuanShenActivity : AppCompatActivity(){
    private var yuanshenList = ArrayList<Yelement>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yuanshen)
        supportActionBar?.hide()
        inityuanshen()//初始化数据
        val layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        val recyclerview:RecyclerView = findViewById(R.id.recyclerView2)
        recyclerview.layoutManager = layoutManager
        val adapter = YuanShenAdapter(yuanshenList)
        recyclerview.adapter = adapter
        recyclerview.addItemDecoration(Decoration())
    }

    private fun inityuanshen(){
        yuanshenList.add(Yelement(R.drawable.secretarea,"秘境副本"))
        yuanshenList.add(Yelement(R.drawable.score,"圣遗物评分"))
        yuanshenList.add(Yelement(R.drawable.calculate,"伤害计算"))
    }
}