package Aquarium

data class Spicee(val name: String, val spiciness: String = "mild")

data class SpiceContainer(val spice: Spicee) {
    val label: String
        get() = spice.name
}

fun main() {
    val container1 = SpiceContainer(Spicee("Curry", "hot"))
    val container2 = SpiceContainer(Spicee("Paprika", "medium"))
    val container3 = SpiceContainer(Spicee("Turmeric", "mild"))


    println(container1.label)
    println(container2.label)
    println(container3.label)
}

