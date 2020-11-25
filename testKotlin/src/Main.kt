fun main() {
    val numbers = arrayOfNulls<Int?>(301)
    for((index, i) in (600 downTo 300).withIndex()){
        numbers[index] = i
    }
    for(i in numbers.size-1 downTo 0 step 5){
        println(i)
    }

}