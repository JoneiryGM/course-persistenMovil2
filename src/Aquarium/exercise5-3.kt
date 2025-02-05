package Aquarium

class Boook(val title: String, val author: String, val year: Int) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun getBookInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book = Boook("The Hobbit", "J.R.R. Tolkien", 1937)

    val (title, author) = book.getTitleAndAuthor()
    println("Title: $title, Author: $author")

    val (bookTitle, bookAuthor, bookYear) = book.getBookInfo()
    println("Here is your book \"$bookTitle\" written by $bookAuthor in $bookYear.")
}
