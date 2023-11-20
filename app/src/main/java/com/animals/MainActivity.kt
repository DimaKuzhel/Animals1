package com.animals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val intentKey: String = "animal"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDog()
        initCat()
        initRabbit()
    }

    private fun initDog() {
        val ivLogoDog: ImageView = findViewById(R.id.iv_dog)
        val tvTitleDog: TextView = findViewById(R.id.tv_title_dog)
        val tvDescDog: TextView = findViewById(R.id.tv_desc_dog)
        val btnInfoDog: Button = findViewById(R.id.btn_info_dog)

        val dog : AnimalData = AnimalData().getDog();

        ivLogoDog.setImageResource(dog.logo)
        tvTitleDog.text = dog.name
        tvDescDog.text = dog.desc

        btnInfoDog.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(intentKey, dog)
            startActivity(intent)
        }
    }

    private fun initCat() {
        val ivLogoCat: ImageView = findViewById(R.id.iv_cat)
        val tvTitleCat: TextView = findViewById(R.id.tv_title_cat)
        val tvDescCat: TextView = findViewById(R.id.tv_desc_cat)
        val btnInfoCat: Button = findViewById(R.id.btn_info_cat)

        val cat : AnimalData = AnimalData().getCat();

        ivLogoCat.setImageResource(cat.logo)
        tvTitleCat.text = cat.name
        tvDescCat.text = cat.desc

        btnInfoCat.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(intentKey, cat)
            startActivity(intent)
        }
    }

    private fun initRabbit() {
        val ivLogoRabbit: ImageView = findViewById(R.id.iv_rabbit)
        val tvTitleRabbit: TextView = findViewById(R.id.tv_title_rabbit)
        val tvDescRabbit: TextView = findViewById(R.id.tv_desc_rabbit)
        val btnInfoRabbit: Button = findViewById(R.id.btn_info_rabbit)

        val rabbit : AnimalData = AnimalData().getRabbit();

        ivLogoRabbit.setImageResource(rabbit.logo)
        tvTitleRabbit.text = rabbit.name
        tvDescRabbit.text = rabbit.desc

        btnInfoRabbit.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(intentKey, rabbit)
            startActivity(intent)
        }
    }
}