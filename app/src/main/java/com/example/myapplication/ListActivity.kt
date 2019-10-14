package com.example.myapplication

import android.R
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.SearchView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list.*


class ListActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_item)
        
//        classList.setOnItemClickListener(){ parent, view, position, id ->
//            val selectedItem = parent.getItemAtPosition(position) as String
//
//            AlertDialog.Builder(this)
//                .setTitle("课程详情")
//                .setMessage("\n课程名:"+selectedItem+"\n课程号：\n\n"+"任课教师:\n\n"+"课程介绍：\n\n")
//                .setPositiveButton("OK") { _, _ ->   }
//                .create().show()
//        }



        }


}









