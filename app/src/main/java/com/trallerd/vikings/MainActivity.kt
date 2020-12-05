package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lagertha.setOnClickListener(this)
        ragnar.setOnClickListener(this)
        bjorn.setOnClickListener(this)
        floki.setOnClickListener(this)
        rollo.setOnClickListener(this)
        athelstan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.lagertha -> {
                val intent = Intent(this, Lagertha::class.java)
                intent.putExtra("where", "Home")
                startActivity(intent)
            }
            R.id.ragnar -> {
                val intent = Intent(this, Ragnar::class.java)
                intent.putExtra("where", "Home")
                startActivity(intent)
            }
            R.id.bjorn -> {
                val intent = Intent(this, Bjorn::class.java)
                intent.putExtra("where", "Home")
                startActivity(intent)
            }
            R.id.floki -> {
                val intent = Intent(this, Floki::class.java)
                intent.putExtra("where", "Home")
                startActivity(intent)
            }
            R.id.rollo -> {
                val intent = Intent(this, Rollo::class.java)
                intent.putExtra("where", "Home")
                startActivity(intent)
            }
            R.id.athelstan -> {
                val intent = Intent(this, Athelstan::class.java)
                intent.putExtra("where", "Home")
                startActivity(intent)
            }
        }
    }
}