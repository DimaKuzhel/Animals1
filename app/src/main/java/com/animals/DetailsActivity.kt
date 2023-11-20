package com.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }

        val ivLogo: ImageView = findViewById(R.id.iv_animal)
        val tvTitle: TextView = findViewById(R.id.tv_title_animal)
        val tvDesc: TextView = findViewById(R.id.tv_desc_animal)

        val animal = intent.getSerializableExtra("animal") as? AnimalData
        if (animal != null) {
            ivLogo.setImageResource(animal.logo)
            tvTitle.text = animal.name
            tvDesc.text = animal.desc
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}