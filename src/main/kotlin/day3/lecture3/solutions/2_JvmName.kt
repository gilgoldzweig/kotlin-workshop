package day3.lecture3.solutions


/**
 *
 * Create two files -
 * one in kotlin and another one in java, name the java file "MyClass"
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
 * 6.   do stuff with JvmStatic
 * 7.   do stuff with JvmOverloads
 * 8.   do stuff with label breaks
 *
 */

fun main() {
}

class Bear(private val color :String = DEFAULT_COLOR){

    init {
        getColor()
    }

    @JvmName("printColor")
    fun getColor() = println("I am a $color ${this::class.simpleName}")

    companion object{
        const val DEFAULT_COLOR = Colors.WHITE
    }
}

object Colors{
    const val WHITE = "white"
}

