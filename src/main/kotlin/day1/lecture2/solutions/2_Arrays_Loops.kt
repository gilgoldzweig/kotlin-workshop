package day1.lecture2.solutions

/**
 * Create an integer array of numbers called "numbers" with 6 cells, that each cell contains the index number multiply 10.
 *
 * Create an empty mutable list for Strings.
 *
 * Write a for loop that loops over the array and adds the string representation of each number to the list.
 *
 */

fun main() {

    val numbers = Array<Int>(6){i->(i*10)}
//  val numbers = Array(6){i->(i+1)} =====> inferred type
    println(numbers.toList())
//  output: [0, 10, 20, 30, 40, 50]

    var list : MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) list.add(i)
    println(list)
//  output: [0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70, 77, 84, 91, 98]
}