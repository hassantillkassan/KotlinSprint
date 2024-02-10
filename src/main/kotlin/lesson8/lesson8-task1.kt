package lesson8

import kotlin.random.Random

fun main() {
    var adViews = intArrayOf()
    var numberOfViews = 0

    for (i in 1..7) adViews += Random.nextInt(0, 100)
    println(adViews.contentToString())

    for (i in adViews.indices) numberOfViews += adViews[i]
    println("Просмотров рекламы за неделю: $numberOfViews")
}