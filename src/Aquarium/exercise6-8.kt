package Aquarium

// Enum de direcciones
enum class Directionss {
    NORTH, SOUTH, EAST, WEST, START, END
}

// Clase Gamesss que maneja la lógica del juego
class Gamesss {
    var path = mutableListOf(Directionss.START)
    var playerLocation = Pair(0, 0) // Ubicación inicial del jugador (0, 0)

    // Mapa simple 4x4 para mostrar ubicaciones
    val map = Array(4) { arrayOfNulls<String>(4) }

    init {
        // Inicializando el mapa con descripciones
        map[0][0] = "Start"
        map[0][1] = "Forest"
        map[0][2] = "Lake"
        map[0][3] = "Mountain"
        map[1][0] = "Village"
        map[1][1] = "Cave"
        map[1][2] = "Desert"
        map[1][3] = "Castle"
        map[2][0] = "River"
        map[2][1] = "Bridge"
        map[2][2] = "Town"
        map[2][3] = "Fortress"
        map[3][0] = "End"
        map[3][1] = "Final Battle"
        map[3][2] = "Treasure"
        map[3][3] = "Victory"
    }

    // Función move que toma una lambda para el movimiento
    fun move(where: () -> Unit) {
        where()
    }

    // Función makeMove que toma la dirección en cadena y ejecuta el movimiento
    fun makeMove(direction: String?) {
        when (direction) {
            "n", "north" -> move(north)
            "s", "south" -> move(south)
            "e", "east" -> move(east)
            "w", "west" -> move(west)
            else -> move(end)
        }
    }

    // Movimientos específicos para las direcciones
    val north: () -> Unit = {
        if (playerLocation.first > 0) {
            playerLocation = Pair(playerLocation.first - 1, playerLocation.second)
            updateLocation()
        } else {
            println("Can't go north!")
        }
    }

    val south: () -> Unit = {
        if (playerLocation.first < 3) {
            playerLocation = Pair(playerLocation.first + 1, playerLocation.second)
            updateLocation()
        } else {
            println("Can't go south!")
        }
    }

    val east: () -> Unit = {
        if (playerLocation.second < 3) {
            playerLocation = Pair(playerLocation.first, playerLocation.second + 1)
            updateLocation()
        } else {
            println("Can't go east!")
        }
    }

    val west: () -> Unit = {
        if (playerLocation.second > 0) {
            playerLocation = Pair(playerLocation.first, playerLocation.second - 1)
            updateLocation()
        } else {
            println("Can't go west!")
        }
    }

    // Fin del juego
    val end: () -> Unit = {
        println("Gamesss Over")
        println("Ruta seguida: ${path.joinToString(" -> ")}")
        println("Gracias por jugar!")
        path.clear()  // Limpiar el camino
    }

    // Actualizar la ubicación en el mapa
    fun updateLocation() {
        val (x, y) = playerLocation
        println("You are now at: ${map[x][y]}")
    }
}

fun main() {
    val Gamesss = Gamesss()

    // Bucle principal del juego
    while (true) {
        println("Enter a direction (n/s/e/w):")
        val input = readLine()

        // Llamada a makeMove con la entrada del usuario
        Gamesss.makeMove(input)

        // Si el juego ha terminado, salimos del bucle
        if (Gamesss.path.isEmpty()) break
    }
}
