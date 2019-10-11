package day2.lecture3.solutions

/**
 * Let's go through an example of getting information about a book in the format of a Pair.
 * Generally, you want information about both the title and the author, and perhaps also the year.
 *
 * Let’s create a basic book class, with a title, author, and year.
 * Of course, you could get each of the properties separately.
 *
 * Create a method that returns both the title and the author as a Pair.
 * Create a method that returns the title, author and year as a Triple.
 *
 * Use the documentation to find out how to use Triple.
 *
 * Create a book instance.
 *
 * Print out the information about the book in a sentence,
 * such as: “Here is your book X written by Y in Z.”
 *
 */
fun main() {
    val book = Book("Orlando", "Virginia Woolf", 1928)
    val (title, author, year) = book.getTitleAndAuthorAndYear()
    println("Here is your book $title written by $author in $year.")
}

class Book(val title: String, val author: String, val year: Int){
    fun getTitleAndAuthor(): Pair<String,String>{
        return Pair(title, author)
    }
    fun getTitleAndAuthorAndYear(): Triple<String,String, Int>{
        return Triple(title, author, year)
    }
}
