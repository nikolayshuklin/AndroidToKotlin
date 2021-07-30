package ru.geekbrains.androidkotlin.data

object Repository: IRepository {
    private var weatherList: List<Weather> = listOf(
        Weather("Москва", 25),
        Weather("Санкт-Петербург", 14),
        Weather("Магадан", 9),
        Weather("Владивосток", 27),
        Weather("Сочи", 33),
        Weather("Ростов", 35),
    )

    override fun getWeathers(): List<Weather> {
        return weatherList
    }
}

interface IRepository {
    fun getWeathers(): List<Weather>
}