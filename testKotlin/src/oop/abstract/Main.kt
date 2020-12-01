package oop.abstract

fun main() {
    val sportsman = Sportsman()
    sportsman.bringSomeWater(object : WaterHolder{
        override fun bringWater() {
            println("here is water")
        }
    })
}