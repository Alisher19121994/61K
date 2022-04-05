package com.best.a61k

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.best.a61k.Module.GetAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var gridView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        get()
        val list = getData()
        refresh(list)
    }

    private fun get() {
        gridView = findViewById(R.id.gridViewBtn1)
    }

    private fun refresh(list: ArrayList<Details>) {
        val adapter = GetAdapter(this, list)
        gridView.adapter = adapter
    }

    private fun getData(): ArrayList<Details> {
        val list = ArrayList<Details>()
        for (i in 1..15) {
            list.add(Details("Pogrammer $i", R.drawable.rasm1))
        }
        return list
    }
}