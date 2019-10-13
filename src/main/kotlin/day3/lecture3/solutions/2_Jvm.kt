package day3.lecture3.solutions

import day3.lecture3.solutions.Colors.BLACK
import day3.lecture3.solutions.Colors.BROWN
import day3.lecture3.solutions.Colors.WHITE
import day3.lecture3.solutions.Utils.getRandom


/**
 *
 * Create two files -
 * one in kotlin and another one in java, name the java file "JvmClass"
 *
 * Your java file should look like this:

        public class MyClass {

            public static void main(String[] args) {
            }
        }

 * 1.   Inside your kotlin file -
 *      Create a class named "Bear", add String property named "color" and set it's default value to "white".
 *
 *      In your java file -
 *      from the main function - make an instant of Bear, and print out it's color.
 *      HINT: use System.out.println("some string") to print from java
 *
 * 2.   Inside your kotlin file, inside Bear class-
 *      Create a method getColor (it is really important to use this name..), this method should print "I am a " + color + className (Bear)
 *
 *      In your java file - Can you see an error?
 *
 * 3.   Fix the error by changing the method getColor name in java to "printColor"
 *      Execute printColor from the java file.
 *
 * 4.   Let's call the method getColor (in kotlin) every time a new instance of class Bear is made
 *      Run your code from the java file, do you see 2 prints of "I am a white Bear" ?
 *      Let's change the java code so it will print only one time.
 *
 * 5.   Since white can describe a lot of things, lets take it out from the Bear class.
 *      Create an object Colors and add the white color to it.
 *      Create a companion object inside of Bear, and add a constant for the default color, and assign it to Colors.WHITE
 *      HINT: We did this yesterday in the lecture about constants, you can see in the slides
 *
 * 6.   Add more colors to the Colors object. (BLACK,BROWN,BLUE,RED,YELLOW,GREEN)
 *      Inside the Colors object create a function that will return a random color.
 *
 * 7.   Change the default color inside the companion object to be a function that returns the result
 *      of Colors.getRandomColor().
 *      Execute the java class few times to check you get a random color each time.
 *
 * 8.   As far as I know bears can only be colored white, black and brown
 *      Let's create a function, inside the companion object that returns a random bear color.
 *      Use the colors from the Colors object.
 *      Change the default color of the bear to be from our new function
 *
 * 9.   In your java file -
 *      Try to call the methods : Colors.getRandomColor(), Bear.getDefaultColor(), Bear.getBearColor()
 *      You cannot call those methods this way because their not static!
 *      Let's fix this in two ways -
 *          1. Change your call to Colors.getRandomColor() to Colors.INSTANCE.getRandomColor()
 *              and the calls from Bear to be from Bear.Companion.
 *              This way we are calling the functions though they're not static from the class instances,
 *              Colors object and the companion object.
 *          2. Add @JvmStatic and try to call those method without the .INSTANCE and .Companion
 *
 * BONUS:  Let's make some changes in our kotlin code:
 *      -   Inside the companion object, create a variable with the list of bear colors BEAR_COLORS
 *      -   Create another object, Utils, and create a generic function that receives a generic list,
 *          and returns a random value from that list.
 *      -   Inside the companion object erase the old "getBearColor" method, and modify the getDefaultColor()
 *          method to return a random color from the BEAR_COLORS list.
 *
 * 10.  Let's add more properties to Bear, I'm pretty sure bears usually have favorite food,
 *      and a different coat thickness. Add those two properties, where the favorite food is a string
 *      and the coat thickness will be represented as an int (0 - bald , 10 - hairy).
 *
 * 11.  Check out how many different ways you have to create a bear in kotlin and in java.
 *      Fix it so you'll have the same amount of constructors in both java and kotlin
 *
 */

fun main() {
    Bear(favoriteFood = "Lasagna", coatThickness = 5)
    Bear("Yellow", favoriteFood = "Salmon", coatThickness = 8)

}

class Bear @JvmOverloads constructor(private val color :String = getDefaultColor(), val favoriteFood :String, val coatThickness :Int){

    init {
        getColor()
    }

    @JvmName("printColor")
    fun getColor() = println("I am a $color ${this::class.simpleName}")

    companion object{
        @JvmStatic
        fun getDefaultColor() : String = getRandom(BEAR_COLORS)
        private val BEAR_COLORS = listOf(WHITE,BLACK,BROWN)
    }
}

object Colors{
    const val WHITE = "white"
    const val BLACK = "black"
    const val BROWN = "brown"
    const val BLUE = "blue"
    const val RED = "red"
    const val YELLOW = "yellow"
    const val GREEN = "green"

    @JvmStatic
    fun getRandomColor() : String = listOf(WHITE,BLACK,BROWN,BLUE,RED,YELLOW,GREEN).random()

}

object Utils{
    fun <T> getRandom(list: List<T>) : T{
        return list.random()
    }
}
