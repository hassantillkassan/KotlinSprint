package lesson_17

class Folder(
    name: String,
    private val numberOfFiles: Int,
    var isHidden: Boolean,
) {

    val name = name
        get() = (
                if (isHidden) "Данная папка скрыта. Количество файлов - 0"
                else "$field: Количество файлов - $numberOfFiles"
                ).toString()

}

fun main() {
    val folder1 = Folder(
        "Pics",
        20,
        true,
    )

    println(folder1.name)
    folder1.isHidden = false
    println(folder1.name)
}