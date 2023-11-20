package com.animals

import java.io.Serializable

class AnimalData(var name: String, var desc: String, var logo: Int) : Serializable {

    constructor() : this("", "", 0)

    fun getDog(): AnimalData {
        return AnimalData(
            "Собака",
            "Собака - домашня тварина, одна з найбільш популярних тварин-компаньйонів",
            R.drawable.ic_dog
        )
    }

    fun getCat(): AnimalData {
        return AnimalData(
            "Кіт",
            "Чутливість кішки до гучності звуку в 3 рази вища, ніж у людини!",
            R.drawable.ic_cat
        )
    }

    fun getRabbit(): AnimalData {
        return AnimalData(
            "Заєць",
            "Зайців можна зустріти на всіх континентах, крім Антарктиди.",
            R.drawable.ic_rabbit
        )
    }
}