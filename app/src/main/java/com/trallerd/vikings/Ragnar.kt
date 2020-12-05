package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lagertha.*
import kotlinx.android.synthetic.main.activity_ragnar.*

class Ragnar : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)
        ragnarLagertha.setOnClickListener(this)
        ragnarBjorn.setOnClickListener(this)
        ragnarFloki.setOnClickListener(this)
        val where = intent.extras!!.getString("where")
        txtWhere6.text = "You came from $where!"
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.ragnarLagertha -> {
                val intent = Intent(this, Lagertha::class.java)
                intent.putExtra("where", "Ragnar")
                startActivity(intent)
            }
            R.id.ragnarBjorn -> {
                val intent = Intent(this, Bjorn::class.java)
                intent.putExtra("where", "Ragnar")
                startActivity(intent)
            }
            R.id.ragnarFloki -> {
                val intent = Intent(this, Floki::class.java)
                intent.putExtra("where", "Ragnar")
                startActivity(intent)
            }
        }
    }
}