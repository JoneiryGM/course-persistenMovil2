package Aquarium

fun main() {
    val myBook = Book("1984", "George Orwell")
    myBook.readPage()
    println("Reading a physical book: ${myBook.title} by ${myBook.author}")

    val myEBook = eBook("The Hobbit", "J.R.R. Tolkien")
    myEBook.readPage()
    println("Reading an eBook: ${myEBook.title} by ${myEBook.author}, Format: ${myEBook.format}")
}

open class Book(val title: String, val author: String) {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}
