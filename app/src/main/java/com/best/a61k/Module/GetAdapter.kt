package com.best.a61k.Module

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.best.a61k.Details
import com.best.a61k.R

class GetAdapter(context: Context, var list: ArrayList<Details>) : BaseAdapter() {

    var inflater: LayoutInflater? = null

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(i: Int): Any? {
        return list[i]
    }

    override fun getItemId(i: Int): Long {
        return i.toLong()
    }

    override fun getView(i: Int, view: View?, viewGroup: ViewGroup?): View? {
        val converter = inflater?.inflate(R.layout.activity_getadapter, null)
        val imageView = converter?.findViewById<ImageView>(R.id.imgBtn)
        val textView = converter?.findViewById<TextView>(R.id.txtBtn1)
        val details = list[i]
        imageView?.setImageResource(details.imageView)
        textView?.text = details.name

        return converter
    }

}