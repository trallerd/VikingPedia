package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_bjorn.*
import kotlinx.android.synthetic.main.activity_lagertha.*

class Bjorn : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)
        bjornAthelstan.setOnClickListener(this)
        bjornFloki.setOnClickListener(this)
        bjornLagertha.setOnClickListener(this)
        bjornRagnar.setOnClickListener(this)
        val where = intent.extras!!.getString("where")
        txtWhere5.text = "You came from $where!"
    }
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.bjornAthelstan -> {
                val intent = Intent(this, Athelstan::class.java)
                intent.putExtra("where", "Bjorn")
                startActivity(intent)
            }
            R.id.bjornFloki -> {
                val intent = Intent(this, Floki::class.java)
                intent.putExtra("where", "Bjorn")
                startActivity(intent)
            }
            R.id.bjornLagertha -> {
                val intent = Intent(this, Lagertha::class.java)
                intent.putExtra("where", "Bjorn")
                startActivity(intent)
            }
            R.id.bjornRagnar -> {
                val intent = Intent(this, Ragnar::class.java)
                intent.putExtra("where", "Bjorn")
                startActivity(intent)
            }
        }
    }
}