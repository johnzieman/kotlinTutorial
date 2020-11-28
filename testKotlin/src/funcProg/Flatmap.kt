package funcProg

fun main() {
    val lists = mapOf(
        "day 1" to listOf<Int>(-1, 2,3,5,33, 55),
        "day 2" to listOf(66, 100, 200, 600, 1200),
        "day 3" to listOf(2000, 2200, 10000, 25000, 50000),
        "day 4" to listOf(200000, 250000, 489000, 1000000),
        "day 5" to listOf(1200000, 240000, 4000000, 10000000)
    )


    val countAverage = lists.filter{it.value.all { it >=0 }}.flatMap { it.value }.average()
    println(countAverage)
}