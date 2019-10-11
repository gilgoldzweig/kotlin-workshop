package day2.lecture1.solutions

/**
 *
 * Let's go back to your spices.
 * Create abstract class, Spice.
 *
 * Let the class be a property with a String for the name of the spice,
 * and an Int for the level of spiciness with default value 5.
 *
 * Create a subclass, Curry.
 * Curry can have varying levels of spiciness, so we don't want to use the default value,
 * but rather pass in the spiciness value.
 *
 * Spices are processed in different ways before they can be used.
 *
 * Add an abstract method prepareSpice to Spice, and implement it in Curry.
 *
 * Curry is ground into a powder, so let's call a method grind().
 *
 * However, grinding is something that's not unique to curry, or even to spices,
 * and it's always done in a grinder.
 *
 * So we can create an Interface, Grinder, that implements the grind() method. Do that now.
 *
 * Then add the Grinder interface to the Curry class.
 *
 */
fun main() {
    //Write your code below this line
}

abstract class Spice(val spiciness :Int = 5){
    abstract val name :String
    abstract fun prepareSpice()
}

class Curry(spiciness :Int) : Spice(spiciness), Grinder {
    override val name: String = this::class.simpleName.toString()
    override fun prepareSpice() {
        grind()
    }
}

interface Grinder{
    fun grind(){
        println("I'm grinding!!")
    }
}
