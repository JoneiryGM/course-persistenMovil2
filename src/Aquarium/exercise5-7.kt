package Aquarium

// Top-level constant for max books a person can borrow
const val MAX_BORROWED_BOOKS = 5

class Bookk(val title: String, val author: String) {

    // Method to check if a user can borrow more books
    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }

    // Method to print the book URL
    fun llamada() {
        println("${Bookk.BASE_URL}$title.html")
    }

    // Companion object to define the BASE_URL constant
    companion object {
        const val BASE_URL = "https://library.com/books/"
    }
}

fun main() {
    val book = Bookk("The Hobbit", "J.R.R. Tolkien")

    // Check if a user can borrow more books
    val borrowedBooks = 3
    println("Can borrow more books? ${book.canBorrow(borrowedBooks)}")

    // Print the URL of the book
    book.llamada()
}
