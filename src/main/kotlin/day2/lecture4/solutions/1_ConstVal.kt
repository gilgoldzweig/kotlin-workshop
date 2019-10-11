package day2.lecture4.solutions

/**
 * Create a top-level constant for the maximum number of books a person could borrow.
 *
 * Inside the Book class, create a method canBorrow() that returns true or false
 * depending on whether a user has already borrowed the max number of books.
 *
 * Create a Constants object that provides constants to the book.
 * For this example, provide the BASE_URL for all books in the library catalog.
 * Inside Book, add a method printUrl that creates and prints a URL composed of BASE_URL,
 * the book title, and “.html”.
 *
 * The base URL is really of interest to the Book class.
 * As such, it makes sense to limit its scope to the Book class.
 * Use a companion object to define the constant in Book.
 *
 */
fun main() {
    Book("Orlando", "Virginia Woolf", 1928).printUrl()
}

class Book(val title: String, val author: String, val year: Int){

    fun getTitleAndAuthor(): Pair<String,String>{
        return Pair(title, author)
    }
    fun getTitleAndAuthorAndYear(): Triple<String,String, Int>{
        return Triple(title, author, year)
    }

    fun canBorrow(numOBooks :Int) : Boolean {
        return numOBooks <= maxBooks
    }

    companion object{
        const val BASE_URL : String = "url"
    }

    fun printUrl() = println("$BASE_URL$title.html")

}

const val maxBooks : Int = 5

object Constants{
    const val BASE_URL : String = "url"
}