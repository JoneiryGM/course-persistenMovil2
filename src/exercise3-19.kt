fun main() {
    // Lambda rollDice
    val rollDice = { sides: Int ->
        if (sides == 0) 0
        else (1..sides).random()
    }

    // Lambda rollDice2 usando la notación de tipo de función
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else (1..sides).random()
    }
    println("hola")
    // Probar las lambdas con diferentes valores
    println("Tirada de dados (sides=12) con rollDice: ${rollDice(12)}")
    println("Tirada de dados (sides=6) con rollDice2: ${rollDice2(6)}")
    println("Tirada de dados (sides=0) con rollDice: ${rollDice(0)}")
    println("Tirada de dados (sides=10) con rollDice2: ${rollDice2(10)}")
    gamePlay(rollDice2)
}

fun gamePlay(rollDice: (Int) -> Int) {
    val diceRoll = rollDice(6)  // You can change the number of sides as needed
    println("Rolled a dice with result: $diceRoll")
}