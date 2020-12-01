package oop.companion

class Companion {
    companion object {
        fun randomNumber(first: Int, second: Int) = (Math.random() * (second - first + 1)).toInt() + first
        fun isBoolean(): Boolean{
            val mRandomNumber = (Math.random() * 3).toInt()
            return mRandomNumber>1
        }
        fun getRandomWeekday(): String{
            val arrayOfDays = arrayListOf<String>(
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            )
            return arrayOfDays[randomNumber(0, 6)]
        }
    }
}

