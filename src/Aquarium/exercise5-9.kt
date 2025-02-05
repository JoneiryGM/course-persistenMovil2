package Aquarium

import kotlin.random.Random

// Clase Bookkk con una propiedad mutable pages
class Bookkk(val title: String, val author: String, var pages: Int)

// Extensión para calcular el peso del libro (1.5g por página)
fun Bookkk.weight(): Double {
    return pages * 1.5
}

// Extensión para arrancar páginas del libro
fun Bookkk.tornPages(pagesTorn: Int) {
    pages = if (pages - pagesTorn > 0) pages - pagesTorn else 0
}

// Clase Puppy con un método para jugar con un libro y arrancar páginas
class Puppy {
    fun playWithBookkk(Bookkk: Bookkk) {
        val pagesTorn = Random.nextInt(1, 10) // El cachorro arranca entre 1 y 10 páginas
        println("El cachorro ha arrancado $pagesTorn páginas de '${Bookkk.title}'.")
        Bookkk.tornPages(pagesTorn)
        println("Páginas restantes: ${Bookkk.pages}")
    }
}

fun main() {
    val Bookkk = Bookkk("El Principito", "Antoine de Saint-Exupéry", 100)
    val puppy = Puppy()

    println("El libro '${Bookkk.title}' pesa ${Bookkk.weight()} gramos.")

    // El cachorro juega con el libro hasta que no queden páginas
    while (Bookkk.pages > 0) {
        puppy.playWithBookkk(Bookkk)
    }

    println("El libro ha quedado sin páginas. ¡El cachorro se ha divertido mucho!")
}
