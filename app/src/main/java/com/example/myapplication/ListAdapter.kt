package com.example.myapplication

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class ListAdapter(activity: MainActivity, itemList: ArrayList<String>) : BaseAdapter(){



    private var activity: Activity? = null

    private var itemList: ArrayList<String>? = null



    //初始化函数。类似于java中的构造器执行顺序

    init {

        this.activity = activity

        this.itemList = itemList

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var holder: TestViewHolder

        var view:View



        if(convertView==null){

            view = View.inflate(activity, R.layout.activity_list,null)

            holder = TestViewHolder(view)

            view.tag = holder

        }else {

            view = convertView

            holder = view.tag as TestViewHolder

        }



        //直接.text来设置文本。类似与java中的 holder.textView.setText("文本");

        holder.str.text = itemList?.get(position) ?: ""



        return view

    }



    override fun getItem(position: Int): Any {

        return itemList?.get(position)!!

    }



    override fun getItemId(position: Int): Long {

        return position.toLong()

    }



    override fun getCount(): Int {

        return itemList?.size!!

    }





    class TestViewHolder(var view:View){

        var str: TextView = view.findViewById(R.id.classList)

    }





}

