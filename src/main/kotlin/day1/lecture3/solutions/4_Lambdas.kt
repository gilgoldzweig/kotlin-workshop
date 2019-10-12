package day1.lecture3.solutions


import java.util.*

/**
 * __________________________________________________________
 * FIY:
 * Random().nextInt(num)
 * this is how to get random numbers in Kotlin from 0 to num
 * __________________________________________________________
 *
 * 1. Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
 *
 * 2. Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
 *
 * 3. If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
 *
 * 4. Create a new variable, rollDice2, for this same lambda using the function type notation. (type notation for example: (String)->Int)
 *
 */

fun main() {

    //1
    val rollDice = { Random().nextInt(12) + 1 }

    //2
/*    val rollDice = { sides: Int ->
        Random().nextInt(sides) + 1
    }
*/

    //3
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    //4
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
}