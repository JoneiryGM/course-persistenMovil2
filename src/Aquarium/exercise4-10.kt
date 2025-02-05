package Aquarium

fun main() {
//    val curry = Curry("curry", "spicy")
//    curry.prepareSpicesss()
//    println("Curry color: ${curry.spiciness}")
}

abstract class Spicesss(val name: String, val spiciness: String = "mild", private val SpicesssColor:String = "color") : SpicesssColor {
    abstract fun prepareSpicesss()
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Spicesss created: $name with spiciness level: $spiciness, heat: $heat, and color: ${SpicesssColor}")
    }
}

//class Curry(name: String, spiciness: String) : Spicesss(name, spiciness), Grinder {
//    fun prepareSpicesss() {
//        grind()
//    }
//
//    override fun grind() {
//        println("Grinding curry into powder")
//    }
//}

interface SpicesssColor {
    val color: String
}

interface Grinder {
    fun grind()
}

