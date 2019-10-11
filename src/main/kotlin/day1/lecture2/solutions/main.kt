package day1.lecture2.solutions

/**
 * Create two ranges
 *      numbers between 1 - 20
 *      letters between 'a' - 'q'
 *
 * Check if a number lies within a range.
 * Check if a letter lies within a range.
 *
 * Iterate over the ranges you created earlier and print the results
 *      extra: with jumps of 2
 *      extra: backwards
 */
fun main() {
    //Write your code below this line

    //Create the ranges below this line
    val numbersRange = 1..20
    val lettersRange = 'a'..'q'

    //Use the ranges with an if statement below this line
    if (5 in numbersRange) {
        println("5 lies within the range")
    }

    if (90 !in numbersRange) {
        println("90 does not lies within the range")
    }

    if ('d' in lettersRange) {
        println("'d' lies within the range")
    }

    if ('z' !in lettersRange) {
        println("'z' does not lies within the range")
    }

    //Iterate over the ranges below this line
    println("Regular number iteration")
    for (number in numbersRange) {
        println(number)
    }

    println("Regular letters iteration")
    for (letter in lettersRange) {
        println(letter)
    }

    //Extra: jumps of 2
    println("Jumps of 2 number iteration")
    for (number in numbersRange step 2) {
        println(number)
    }

    println("Jumps of 2 letters iteration")
    for (letter in lettersRange step 2) {
        println(letter)
    }

    //Extra: backwards
    println("Backwards number iteration")
    for (number in numbersRange.reversed()) {
        println(number)
    }

    println("Backwards letters iteration")
    for (letter in lettersRange.reversed()) {
        println(letter)
    }
}