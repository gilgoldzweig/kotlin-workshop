package day1.lecture1.solutions

/**
 * Create a nullable integer variable
 *
 * Use a null-check that increases the value by one if it's not null,
 * otherwise returns 0, and prints the result.
 *
 */
fun main() {
    val nullableInt :Int? = 10
    println("${nullableInt?.plus(1) ?: 0}")
}