fun main() {
    println("Fortune is ${getFortuneCookie()}")
}

fun getFortuneCookie(): String {
    // Lista de mensajes de galleta de la suerte
    val fortunes = listOf(
        "¡Tendrás un día estupendo!",
        "Las cosas te irán bien hoy.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para actuar con moderación.",
        "¡Tómatelo con calma y disfruta de la vida!",
        "Aprecia a tus amigos porque son tu mayor fortuna."
    )

    // Solicita al usuario que ingrese su fecha de nacimiento
    print("Ingresa tu fecha de nacimiento: ")
    val birthday = readLine()?.toIntOrNull() ?: 1

    // Calcula el índice de la fortuna basado en la fecha de nacimiento
    val fortuneIndex = birthday % fortunes.size

    // Devuelve la fortuna correspondiente
    return fortunes[fortuneIndex]
}
