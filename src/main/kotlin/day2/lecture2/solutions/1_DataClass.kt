package day2.lecture2.solutions

import day2.lecture1.solutions.Grinder

/**
 * Create a simple data class, "SpiceContainer", that holds one spice.
 * Give "SpiceContainer" a property, "label", that is derived from the name of the spice.
 * Create some containers with spices and print out their labels.
 */


abstract class Spice(val name: String, val spiciness: String = "mild") {
    abstract fun prepareSpice()
}


class Curry(name: String = "Curry", spiciness: String) : Spice(name, spiciness),
    Grinder {

    override fun prepareSpice() {
        grind()
    }
}


data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

fun main() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy"))
    )

    for (element in spiceCabinet) println(element.label)
}

