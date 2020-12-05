package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*
import kotlinx.android.synthetic.main.activity_lagertha.*

class Floki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)
        val where = intent.extras!!.getString("where")
        txtWhere4.text = "You came from $where!"
        flokiRagnar.setOnClickListener{
            val intent = Intent(this, Ragnar::class.java)
            intent.putExtra("where", "Floki")
            startActivity(intent)
        }
    }
}