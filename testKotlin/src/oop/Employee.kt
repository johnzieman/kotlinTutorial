package oop

import java.time.LocalDate
import java.util.*

class Employee(val name: String, val position: String, val hiringYear: Int) {
    fun isWorking() = "Working"

    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - hiringYear
}