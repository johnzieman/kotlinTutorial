package oop

fun main() {
    var book = Book("John")
    book.price = "12$"
    book.year = "2000"
    println("${book.name} ${book.year} ${book.price}")
}