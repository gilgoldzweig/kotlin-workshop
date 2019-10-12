package day3.lecture3.solutions

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
    someFunction1()
}

fun someFunction1(){
//     //ANSWER FOR 1
//    outerLoop@for( i in 1..3){
//        for (j in 5..7){
//            if(i == 2 && j == 6) break@outerLoop
//            print ("${(i * 100) + j} ")
//        }
//        println("$i loop ends")
//    }
//    println("\nWe are done")

//     //ANSWER FOR 2
//    outerLoop@for( i in 1..3){
//        for (j in 5..7){
//            if(i == 2 && j == 6) continue@outerLoop
//            print ("${(i * 100) + j} ")
//        }
//        println("$i loop ends")
//    }
//
//    println("\nWe are done")

//     //ANSWER FOR 3
//    for( i in 1..3){
//        listOf(5,6,7).forEach {
//            if(i == 2 && it > 5) return@forEach
//            print ("${(i * 100) + it} ")
//        }
//        if (i!=2) println("$i loop ends")
//    }
//
//    println("\nWe are done")


//     //ANSWER FOR 4 - No
//    for( i in 1..3){
//        listOf(5,6,7).forEach(fun(value: Int) {
//            if(i == 2 && value > 5) return
//            print ("${(i * 100) + value} ")
//        })
//        if (i!=2) println("$i loop ends")
//    }
//
//    println("\nWe are done")
}

