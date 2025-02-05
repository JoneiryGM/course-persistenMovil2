fun main() {
    print("¿Cómo te sientes hoy? ")
    val mood = readLine()!!
    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "soleado", temperature: Int = 24): String {
    return when {
        shouldGoForAWalk(mood, weather) -> "¡Ve a dar un paseo!"
        shouldStayInBed(mood, weather, temperature) -> "Quédate en la cama"
        shouldGoSwimming(temperature) -> "Ve a nadar"
        shouldRelaxAtHome(temperature) -> "Relájate en casa"
        mood == "sad" && weather == "nublado" -> "Quédate en casa y mira una película."
        temperature < 0 -> "Hace frío afuera, mejor quédate en casa."
        mood == "excited" && weather == "lluvioso" -> "¿Qué tal un día de spa en casa?"
        mood == "relaxed" && temperature > 25 -> "Disfruta de un día en la piscina."
        else -> "Quédate en casa y lee un libro."
    }
}

fun shouldGoForAWalk(mood: String, weather: String): Boolean {
    return mood == "happy" && weather == "soleado"
}

fun shouldStayInBed(mood: String, weather: String, temperature: Int): Boolean {
    return mood == "sad" && weather == "rainy" && temperature == 0
}

fun shouldGoSwimming(temperature: Int): Boolean {
    return temperature > 35
}

fun shouldRelaxAtHome(temperature: Int): Boolean {
    return temperature > 30
}
