package oop

class Dog {
    var name: String? = null
        get() {
            return if (field == null) {
                " "
            } else return field?.toLowerCase()?.capitalize()

        }

    var age: Int = 0
    var weight: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else field = 1
        }
}