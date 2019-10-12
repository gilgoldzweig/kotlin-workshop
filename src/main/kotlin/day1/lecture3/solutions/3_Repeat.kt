package day1.lecture3.solutions

/**
 * Create code that prints out your name 4 time.
 *
 * **Bonus**
 * add the iteration num to the output
 */

fun main() {
    repeat(4) {
        print("shmoopidu ")
    }

    //Bonus
    repeat(4) {
        print("shmoopidu $it ")
    }
}