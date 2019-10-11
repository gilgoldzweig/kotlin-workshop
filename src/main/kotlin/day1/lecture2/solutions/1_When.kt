package day1.lecture2.solutions

/**
 * Create a when statement with three comparisons:
 *
 * Create a string variable with your name
 *
 * If the length of your name is 0, print an error message.
 * If the length is longer than 2, but shorter than 12, print your name and the length.
 * If it's anything else, print "OK name".
 *
 */
fun main() {
    val name = "Hadas"
    when (val nameLength = (name.length)) {
        0 -> println("an error message.")
        in 3..11 -> println("$name , $nameLength")
        else -> {
            println("OK name")
        }
    }
}