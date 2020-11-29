package oop.Extends

fun main() {
    val employee = listOf<Employee>(
        Employee("John", 12),
        Employee("John2", 13),
        Employee("John3", 14),
        Employee("John4", 15),
        Employee("John5", 16),
        Employee("John6", 17),
        Programmer("John", 18, "Pascal"),
        Programmer("John", 19, "HTML, CSS"),
        Programmer("John", 20, "Javascript"),
        Programmer("John", 21, "Java, Kotlin")
    )

    for (i in employee){
        i.work()         
    }
}
