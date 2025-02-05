package Aquarium

open class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Spice created: $name with spiciness level: $spiciness and heat: $heat")
    }
}

fun main() {
    val spices = listOf(
        Spice("curry"),
        Spice("pepper", "spicy"),
        Spice("cayenne", "very spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("red pepper", "spicy")
    )

    // Crear una lista de especias que sean picantes o menos picantes
    val mildOrLess = spices.filter { it.heat <= 5 }
    println("Spices that are mild or less spicy: $mildOrLess")

    // Crear una función auxiliar llamada makeSalt()
    val salt = makeSalt()
    println("Salt created: ${salt.name} with spiciness level: ${salt.spiciness} and heat: ${salt.heat}")
}

fun makeSalt() = Spice("salt")
