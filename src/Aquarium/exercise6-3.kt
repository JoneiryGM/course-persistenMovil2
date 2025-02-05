package Aquarium

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)
}

fun main() {
    val game = Game()

    val north: () -> Unit = { game.path.add(Directions.NORTH) }
    val south: () -> Unit = { game.path.add(Directions.SOUTH) }
    val east: () -> Unit = { game.path.add(Directions.EAST) }
    val west: () -> Unit = { game.path.add(Directions.WEST) }

    val end: () -> Boolean = {
        game.path.add(Directions.END)
        println("Game Over")
        println("Ruta seguida: ${game.path.joinToString(" -> ")}")
        game.path.clear()
        false
    }

    println("Ruta inicial: ${game.path.joinToString(" -> ")}")

    north()  // Agrega NORTH
    east()   // Agrega EAST
    south()  // Agrega SOUTH
    west()   // Agrega WEST

    println("Ruta después de los movimientos: ${game.path.joinToString(" -> ")}")

    end()

    println("Ruta después de terminar el juego: ${game.path.joinToString(" -> ")}")
}
