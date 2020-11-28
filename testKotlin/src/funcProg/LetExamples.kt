package funcProg

var name: String? = "Hellloo"
var nullableArraylist: MutableList<Int>? = mutableListOf()


fun main() {
    name?.let {
        if (it.length > 5) {
            println("helllooo")
        }
    }

    val list = mutableListOf<Int>()
    for (i in 0 until 1000) {
        list.add((Math.random() * 1000).toInt())
    }

    val average = list.average();
    val maxNumber = list.max()
    println("$average -> $maxNumber")

    nullableArraylist?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it%2==0 }.take(100)
            for( i in result) println(i)
        }
    }

    fun modifyList(mutableList: MutableList<Int>, modify: (MutableList<Int>) -> Int): Int {
        return modify(mutableList)
    }

    val result = modifyList(mutableListOf(1,2 ,3,45,6,7,8,10), {it.sum()})
    println(result)

    println(10.isSimple())

    println(10.toSquare())
    println(2.toSquare())
    println(11.toSquare())
    println(12.toSquare())
    println(13.toSquare())
    println(3.toSquare())
}

fun Int.isSimple(): Boolean {
    if (this <= 3 ) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

fun Int.toSquare(): Int{
    return this * this
}
