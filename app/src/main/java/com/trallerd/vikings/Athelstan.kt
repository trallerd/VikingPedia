package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_athelstan.*
import kotlinx.android.synthetic.main.activity_lagertha.*

class Athelstan : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_athelstan)
        athelstanBjorn.setOnClickListener(this)
        athelstanRagnar.setOnClickListener(this)
        val where = intent.extras!!.getString("where")
        txtWhere2.text = "You came from $where!"
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.athelstanBjorn -> {
                val intent = Intent(this, Bjorn::class.java)
                intent.putExtra("where", "Athelstan")
                startActivity(intent)
            }
            R.id.athelstanRagnar -> {
                val intent = Intent(this, Ragnar::class.java)
                intent.putExtra("where", "Athelstan")
                startActivity(intent)
            }
        }
    }
}