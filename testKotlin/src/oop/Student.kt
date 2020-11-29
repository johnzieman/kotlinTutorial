package oop

//here I can add data before class, but I want to do it with operators, 'coz want to see how it'll work,
// and I know about copy() , but I want to create the same by myself with extensions
class Student(val name:String, val lastName:String, val id: String) {
    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id
}