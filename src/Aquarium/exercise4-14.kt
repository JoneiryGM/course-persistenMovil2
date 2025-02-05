package Aquarium

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color = Color.YELLOW
}

sealed class Spicees(val name: String, val spiciness: String, val color: SpiceColor) {

    fun heatLevel(): Int {
        return when (spiciness) {
            "mild" -> 1
            "medium" -> 5
            "hot" -> 10
            else -> 0
        }
    }
}

class Curry(spiciness: String) : Spicees("Curry", spiciness, YellowSpiceColor)

fun main() {
    val curry = Curry("medium")

    println("Spice: ${curry.name}")
    println("Spiciness: ${curry.spiciness}")
    println("Color: ${curry.color.color}")
    println("Heat Level: ${curry.heatLevel()}")
}
