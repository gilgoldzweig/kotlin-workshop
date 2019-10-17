package day3.lecture2.solutions

import java.lang.StringBuilder

/**
 * Change the function so that it will:
 *
 * @receiver Extension function on [MutableList] of type [E]
 * @param filter: Lambda function that has a parameter of type [E] and it should return [Boolean]

 * @return A filtered list based on the [filter] lambda
 */
fun <E> MutableList<E>.filter(filter: (E) -> Boolean): MutableList<E> {
    val filteredList = ArrayList<E>()
    for (element in this) {
        if (filter(element)) {
            filteredList.add(element)
        }
    }
    return filteredList
}


/**
 *  ****Extra****
 *  Implement the method [with]
 *  It should contain 2 Generic types [T], [R]
 *
 * @param receiver with type [T]
 * @param block with type of higher-order extension function on [T] and it should return [R]
 *
 * @return [R] the return value from the execution of [block]
 *
 * usage:
 *
 *  with(someValue) {
 *      //some value is the receiver
 *  }
 */
fun <T, R> with(receiver: T, block: T.() -> R): R {
    return receiver.block()
}


fun main() {
    val a = StringBuilder()

    with(a) {
        append("Name")
        append("Gil")
    }

    println(a)
}