package funcProg

fun main() {
    val fullNames = mutableListOf<String>()

    for (i in 0..1000) {
        fullNames.add("Name:$i Lastname:$i")
    }

    val names = fullNames.map { it.substringBefore(" ") }
    val lastNames = fullNames.map { it.substringAfter(" ") }
    val users = names.zip(lastNames)
    for (names in users) println("${names.first} ${names.second}")
}