package day2.lecture2.solutions


/**
 * Create a singleton class named "Counter" the class should have
 *
 *   1. private mutable variable [Int] named [counter] with a starting value of 0
 *   2. a single line function called [currentCount] which returns the value of [counter]
 *   3. a function called [increment] which adds 1 to the [counter] variable
 *
 */

//__________________Write your singleton here______________
object Counter {
    private var counter: Int = 0

    fun currentCount() = counter

    fun increment() = counter++
}

/**
 * Create an enum class named "SolarSystem" the class needs to be filled with the following information
 *
 *
 * MERCURY
 * VENUS
 * EARTH
 * MARS
 * JUPITER
 * SATURN
 * URANUS
 * NEPTUNE
 *
 * EXTRA: add a radius parameter to the enum class and fill the stars with the radius
 *
 * MERCURY = 2,439.7
 * VENUS = 6,051.8
 * EARTH = 6,371
 * MARS = 3,389.5
 * JUPITER = 69,911
 * SATURN = 58,232
 * URANUS = 25,362
 * NEPTUNE = 24,622
 */

//__________________Write your enum class here______________
enum class SolarSystem {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE
}

enum class SolarSystemExtra(radius: Double) {
    MERCURY(2439.0),
    VENUS(6051.8),
    EARTH(6371.0),
    MARS(3389.5),
    JUPITER(69911.0),
    SATURN(58232.0),
    URANUS(25362.0),
    NEPTUNE(24622.0)
}


/**
 * Write a sealed class named State with parameter [state] of type [String]
 * with four sub data classes
 *
 * each class should have a [status] variable inside the constructor and have a default value with the class name
 * Provide the [status] to the [State] constructor
 *
 * [Idle]
 * [Loading]
 * [Completed]
 * [Error]
 */

//__________________Write your sealed class here______________

sealed class State(var state: String)

data class Idle(var status: String = "Idle"): State(status)
data class Loading(var status: String = "Loading"): State(status)
data class Completed(var status: String = "Completed"): State(status)
data class Error(var status: String = "Error"): State(status)
