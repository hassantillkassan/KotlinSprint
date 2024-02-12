package lesson8

import kotlin.random.Random

fun main() {
    var adViews = intArrayOf()

    for (i in 1..7) adViews += Random.nextInt(0, 100)
    println(adViews.contentToString())

    println("Просмотров рекламы за неделю: ${adViews.sum()}")
}