package oop.Extends

open class Employee(val name: String, val age: Int) {
    open fun work(){
        println("Working")
    }
}