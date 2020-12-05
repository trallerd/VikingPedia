package com.trallerd.vikings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lagertha.*

class Lagertha : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_lagertha)
        lagerthaRagnar.setOnClickListener(this)
        lagerthaBjorn.setOnClickListener(this)
        val where = intent.extras!!.getString("where")
        txtWhere.text = "You came from $where!"
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.lagerthaRagnar -> {
                val intent = Intent(this, Ragnar::class.java)
                intent.putExtra("where", "Lagertha")
                startActivity(intent)
            }
            R.id.lagerthaBjorn -> {
                val intent = Intent(this, Bjorn::class.java)
                intent.putExtra("where", "Lagertha")
                startActivity(intent)
            }
        }
    }
}