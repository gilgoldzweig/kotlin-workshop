package day3.lecture3.exercises


/**
 *
 *  Run the program
 *
 * 1. Modify someFunction() so it will print :

        105 106 107 1 loop ends
        205
        We are done

 * 2. Modify someFunction so it will print:

        105 106 107 1 loop ends
        205 305 306 307 3 loop ends

        We are done

 * 3. Modify someFunction so the second loop: for (j in 5..7)
 *    will be a listOf(5,6,7) and call the forEach operator to implement the iteration using lambda.
 *    Modify the function so that your out put won't change.
 *    Your out put should be:

        105 106 107 1 loop ends
        205 305 306 307 3 loop ends

        We are done
 *
 * 4.   pass an anonymous function to forEach instead of the lambda.
 *      Did your out put changed?
 *
 */

fun main() {
    someFunction()
}

fun someFunction(){
    for( i in 1..3){
        for (j in 5..7){
            print ("${(i * 100) + j} ")
        }
        println("$i loop ends")
    }
    println("We are done")
}


