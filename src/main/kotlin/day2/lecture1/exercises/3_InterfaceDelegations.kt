package day2.lecture1.exercises

/**
 *
 * Let's go back to your spices.
 *
 * Create an interface, SpiceColor, that has a color property.
 * You can use a String for the color.
 *
 * Create a singleton subclass, YellowSpiceColor, using the object keyword,
 * because all instances of Curry and other spices can use the same YellowSpiceColor instance.
 *
 * Add a color property to Curry of type SpiceColor, and set the default value to YellowSpiceColor.
 *
 * Add SpiceColor as an interface, and let it be by color.
 *
 * Create an instance of Curry, and print its color.
 *
 * However, color is actually a property common to all spices,
 * so you can move it to the parent class.
 * Change your code so that the SpiceColor interface is added to the Spice class and inherited by Curry.
 */
fun main() {
    //Write your code below this line
}

//abstract class Spice(val spiciness :Int = 5){
//    abstract val name :String
//    abstract fun prepareSpice()
//}
//
//class Curry(spiciness :Int) : Spice(spiciness), Grinder {
//    override val name: String = this::class.simpleName.toString()
//    override fun prepareSpice() {
//        grind()
//    }
//}
//
//interface Grinder{
//    fun grind(){
//        println("I'm grinding!!")
//    }
//}