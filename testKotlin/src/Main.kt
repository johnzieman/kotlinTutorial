fun main() {
    fun sumOfNumbers(vararg numbers: Int): Int {
        var numb = 0;
        for (i in numbers) {
            numb += i
        }
        return numb
    }

    println(sumOfNumbers(1, 2, 3, 4, 56, 0))

    fun bubleSorting(numbers: MutableList<Int>): List<Int> {
        for (i in 0 until numbers.size - 1) {
            for (j in 0 until numbers.size - 1) {
                if (numbers[j] > numbers[j + 1]) {
                    val a = numbers[j]
                    numbers[j] = numbers[j + 1]
                    numbers[j + 1] = a
                }
            }
        }
        return numbers
    }

    val randomNumbers: MutableList<Int> = mutableListOf(12, 0, 12, 11, 11111, -1, -2, 14, -1000000, 123456)
    println(bubleSorting(randomNumbers))


    val square: (Int) -> Int = { a -> a * a }
    println(square(11))

    val getSquare: (Int) -> Int = { a -> a * a * a }
    println(getSquare(11))


    val getPerimetr: (Int, Int) -> Int = { a, b -> (a + b) * 2 }
    println(getPerimetr(7, 7))


    val getHelloName: (String) -> Unit = { println("Hello $it") }
    getHelloName("John")

    val arraysOfSort: (MutableList<Int>) -> MutableList<Int> = {
        for (i in 0 until it.size - 1) {
            for (j in 0 until it.size - 1) {
                if (it[j] < it[j + 1]) {
                    val a = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = a
                }
            }
        }
        it
    }

    val arrays: MutableList<Int> = arrayListOf(1, 2,5, -1, 1111, 14, -43, 43, 65, -65)
    println(arraysOfSort(arrays))

    val numbers = arrayListOf<Int>(1, 2, 3,4, 5,6 ,7, 8,10)
    val sortNumbers = numbers.filter { number:Int -> number%2==0 }
    for(i in sortNumbers) println(i)



//    public class Sparbach {
//        public static void main(String[] args) {
//            int [] massive = {4, 2, 9, 6, 12, 7, 10, 3, 13, 11, 77, 100, 1};
//            bubleSort(massive);
//        }
//
//        public static void bubleSort(int[] massive){
//            for(int i = 0; i < massive.length - 1; i++){
//                for(int j = 0; j < massive.length-1; j++){
//                if(massive[j] > massive[j+1]){
//                    int m = massive[j];
//                    massive[j] = massive[j+1];
//                    massive[j+1] = m;
//                }
//            }
//            }
//            System.out.println(Arrays.toString(massive));
//        }

}