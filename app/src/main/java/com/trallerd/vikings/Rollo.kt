package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lagertha.*
import kotlinx.android.synthetic.main.activity_rollo.*

class Rollo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)
        val where = intent.extras!!.getString("where")
        txtWhere3.text = "You came from $where!"
        rolloBjorn.setOnClickListener {
            val intent = Intent(this, Bjorn::class.java)
            intent.putExtra("where", "Rollo")
            startActivity(intent)
        }
    }
}