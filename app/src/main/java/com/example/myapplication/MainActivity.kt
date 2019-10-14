package com.example.myapplication

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            if (editText.text.isBlank() or editText2.text.isBlank()) {
                AlertDialog.Builder(this)
                    .setTitle("错误")
                    .setMessage("用户名或密码不能为空")
                    .setPositiveButton("OK") { _, _ -> }
                    .create().show()
            } else {
                var intent = Intent()
                intent.setClass(this, ListActivity().javaClass)
                startActivity(intent)
            }

        }

    }
}