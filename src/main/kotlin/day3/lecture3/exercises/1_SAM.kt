package day3.lecture3.exercises

/**
 * Remember SAM?
 *
 * In Java we have the folowing inreface:
 *
 * 		public interface Comparator<T> {
 * 			int compare(T o1, T o2);
 * 		}
 *
 * This Comparator has much more functionality, but only a single abstract method - compare.
 *
 * The `compare` method compares its two arguments for order.
 * It returns a negative integer, zero, or a positive integer as the first argument is less than,
 *  equal to, or greater than the second.
 *
 * In the starter code, I sort a list of integers from the smallest to the greates using the `Comparator`.
 *
 * Change an object expression to a lambda.
 *
 **/

import java.util.*

fun main() {

    // my implementation of comparator
    val myComparator = object: Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            return o1 - o2
        }
    }

    // my array list
    val myArrayList = arrayListOf(2, 0, 1, 9)

    // sorts myArrayList by myComparator
    Collections.sort(myArrayList, myComparator)

    // prints the sorted list
    println(myArrayList)
}