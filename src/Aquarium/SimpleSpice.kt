package Aquarium

class SimpleSpice {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5}
}

fun main() {
    val spice = SimpleSpice()
    println("Spice name: ${spice.name}")
    println("Spice spiciness: ${spice.spiciness}")
    println("Heat level: ${spice.heat}")
}