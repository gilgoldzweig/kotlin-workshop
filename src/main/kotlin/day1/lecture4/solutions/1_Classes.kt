package day1.lecture4.solutions

/**
 *
 * Create class, SimpleSpice.
 *
 * Let the class be a property with a String for the name of the spice,
 * and a String for the level of spiciness.
 *
 * Set the name to "curry" and the spiciness to "mild".
 *
 * Using a string for spiciness is nice for users, but not useful for calculations.
 *
 * Add a heat property to your class with a getter that returns a numeric value for spiciness.
 * Use a value of 5 for mild.
 *
 * Add an init block that prints out its name and heat.
 *
 * Create an instance of SimpleSpice.
 *
 */

fun main() {
}

class SimpleSpice(val name: String = "curry", private val spiciness: String = "mild"){
    private val heat
        get() = when (spiciness){
            "not spicy" -> 0
            "mild" -> 5
            "hot" -> 7
            "extra hot" -> 10
            else -> {
                0
            }
        }

    init {
        println("$name , $heat")
    }
}