fun main() {
    val name = arrayListOf<String>("John", "Jack", "Ann", "Katy", "Tomas", "Jet", "Gouth")
    val namesWithJ = name.filter { name: String -> name.startsWith("J") }
    for (i in namesWithJ) println(i)


    val numbers = (0..100).toList()
    val numbersToString  = numbers.map { "Employee #$it" }
    for (i in numbersToString) println(i)

    //version 1

    val numbersRandom = arrayListOf<Int>()
    for (i in 0 until 1000) {
        numbersRandom.add((Math.random() * 1000).toInt())
    }
    val sortedArrays = numbersRandom.filter { it % 3 == 0 && it % 5 == 0 }
    val squre: (Int) -> (Int) = { it * it }

    val sortedNumbers = mutableListOf<Int>()
    for (i in sortedArrays) {
        sortedNumbers.add(squre(i))
    }
    val arraysToDescending = sortedNumbers.sortedDescending()
    val arraysToString = arraysToDescending.map { "$it" }
    for (i in arraysToString) println(i)


    //the same but in kotlin style || version 2

    val randomNumbersArray = mutableListOf<Int>()
    for (i in 0..1000) {
        randomNumbersArray.add((Math.random() * 1000).toInt())
    }
    val result =
        randomNumbersArray.filter { it % 3 == 0 && it % 5 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in result) println(i)
}

