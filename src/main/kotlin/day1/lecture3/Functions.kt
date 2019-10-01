package day1.lecture3

/**
 * Fix the functions below to make the produce the output below
 *
 *       -> "Hello world"
 *       -> "Hello Gil Brown"
 *       -> "Hello Erez Brown"
 *       -> "The school size times 5 is 500"
 */
fun main() {
    //Don't change the code below
    hello()
    helloWithDefaultArguments("Gil", "Brown")
    helloWithDefaultArguments(lastName = "Brown")
    println("The school size times 5 is ${schoolSizeTimes(100, 5)}")
}

/**
 * Change the function so it will [println] -> "Hello world"
 */
fun hello() {}

/**
 * Add two parameters to the function and write the code so it will [println] -> "Hello [firsName] [lastName]"
 *
 * @param firstName with type [String] with a default value of "Erez"
 * @param lastName with type [String] without default value
 */
fun helloWithDefaultArguments() {}

/**
 * Change the function to fit the rules below as a single line function
 *
 * @param currentStudentsSize [Int]
 * @param times [Int]
 *
 * @return [currentStudentsSize] * [times]
 */
fun schoolSizeTimes() =
