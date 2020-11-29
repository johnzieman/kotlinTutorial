package oop

fun main() {
    var book = Book("John")
    book.price = "12$"
    book.year = "2000"
    println("${book.name} ${book.year} ${book.price}")
    var cat = Cat("Catiko", 11)
    println(cat.isOld())

    var employee = Employee("John", "CEO", 2019)
    employee.getInfo()

    val student1 = Student("John", "Zieman", "213495432")
    val student2 = student1.anotherCopy()
    println("${student2.name} ${student2.lastName}")


    val adress1 = Adress("LA", "Groove st", 12)
    val adress2 = adress1.copy()
    val ( _ ,lastName, id ) = adress1
    println(lastName)

    println(adress1)
    println(adress2)
    println(adress1.hashCode())
    println(adress2.hashCode())
    println(adress1 == adress2)

}
fun Cat.isOld() = age >10
fun Employee.getInfo(){
    println("$name $position $hiringYear ${isWorking()} $experience")
}

fun Student.anotherCopy(): Student{
    return Student(component1(), component2(), component3())
}


