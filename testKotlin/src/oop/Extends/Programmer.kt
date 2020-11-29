package oop.Extends

class Programmer(name: String, age: Int, val language: String) : Employee(name, age) {
    override fun work() {
        println("My job language is $language")
    }
}