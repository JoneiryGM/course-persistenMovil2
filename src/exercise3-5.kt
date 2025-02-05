fun main(args: Array<String>) {
    val hora = args[0].toInt()
    val saludo = if (hora < 12) "Buenos días, Kotlin" else "Buenas noches, Kotlin"
    println(saludo)
}
