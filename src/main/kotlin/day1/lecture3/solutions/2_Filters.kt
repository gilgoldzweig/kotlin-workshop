package day1.lecture3.solutions

/**
 * Create a filter that gets all the curries and sorts them by string length.
 *
 * Filter the list of spices to return all the spices that start with 'c' and end in 'e'.
 *
 * **Bonus**
 * Take the first three elements of the list and return the ones that start with 'c'.
 */

fun main() {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

//    Sorting curries by string length
    spices.filter { it.contains("curry") }.sortedBy { it.length }

//    Filtering by those that start with 'c' and end with 'e'
    spices.filter{it.startsWith('c')}.filter{it.endsWith('e')}
//    output:> [cayenne]

//    Filtering the first 3 items by 'c'
    spices.take(3).filter{it.startsWith('c')}
//    output:> [curry, cayenne]


}