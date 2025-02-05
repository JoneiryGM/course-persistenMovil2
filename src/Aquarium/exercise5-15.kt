package Aquarium

fun main() {
    // Conjunto de títulos de libros de William Shakespeare
    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Othello", "Macbeth")

    // Mapa que asocia el conjunto de libros con el autor
    val library = mapOf("William Shakespeare" to allBooks)

    // Verifica si alguno de los libros en la biblioteca es "Hamlet"
    val hasHamlet = library.any { it.value.contains("Hamlet") }
    println("Does the library have Hamlet? $hasHamlet")

    // MutableMap con más libros
    val moreBooks = mutableMapOf<String, String>()

    // Agregar un libro usando getOrPut()
    moreBooks.getOrPut("The Great Gatsby") { "F. Scott Fitzgerald" }
    moreBooks.getOrPut("Moby Dick") { "Herman Melville" }

    // Buscar un libro con getOrPut(), si no existe, lo agrega
    val author = moreBooks.getOrPut("Pride and Prejudice") { "Jane Austen" }

    // Imprimir los libros en moreBooks
    println("More Books: $moreBooks")
}
