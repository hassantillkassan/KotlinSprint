package lesson_15

abstract class MusicProducts {

    abstract val name: String
    abstract val stockQuantity: Int
}

class MusicalInstruments(
    override val name: String,
    override val stockQuantity: Int
) : MusicProducts(), Searching {

    override fun searchForComponents() {
        println("Выполняется поиск")
    }

}

class InstrumentComponents(
    override val name: String,
    override val stockQuantity: Int
) : MusicProducts()

interface Searching {

    fun searchForComponents()

}

fun main() {
    val musicalInstrument = MusicalInstruments(
        "Гитара",
        3,
    )
    val instrumentComponents = InstrumentComponents(
        "Струны",
        54,
    )

    musicalInstrument.searchForComponents()
}