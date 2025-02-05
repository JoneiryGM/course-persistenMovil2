fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nTu fortuna es: $fortune")
        if (fortune.contains("¡Tómatelo con calma y disfruta de la vida!")) break
    }
}

fun getBirthday(): Int {
    print("Ingresa tu fecha de nacimiento: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf(
        "¡Tendrás un día estupendo!",
        "Las cosas te irán bien hoy.",
        "Disfruta de un maravilloso día de éxito.",
        "Sé humilde y todo saldrá bien.",
        "Hoy es un buen día para actuar con moderación.",
        "¡Tómatelo con calma y disfruta de la vida!",
        "Aprecia a tus amigos porque son tu mayor fortuna."
    )

    return when (birthday) {
        28, 31 -> "¡Tómatelo con calma y disfruta de la vida!"
        in 1..7 -> "¡Tendrás un día estupendo!"
        else -> fortunes[birthday % fortunes.size]
    }
}
