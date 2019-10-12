package day1.lecture4.exercises



/**
 *
 * So, let's talk more about visibility modifiers
 *
 * I created a class Outer with many properties and an inner class,
 * and I am using a variety of visibility modifiers.
 *
 *
 * This is how fun looks like
 *
 * You can see that my class is an `open class` we didn't talk about it yet (we'll talk about it tomorrow).
 * The `open` key word will let us create subclasses from class Outer.
 *
 * We also have a subclass for Outer named Subclass with an empty init box waiting just for you to fill it.
 *
 * In the empty init block of Subclass:
 *
 * 1. Try to call property a, is it visible for Subclass? why?
 * 2. Try to call property b, is it visible for Subclass? why?
 * 3. Try to call property c, is it visible for Subclass? why?
 * 4. Try to call property d, is it visible for Subclass? why?
 * 5. Try to create an instance of Nested, is it visible for Subclass? why?
 *    If Nested is visible try to call property e.
 *
 *
 *
 * We have another class here - Unrelated
 * Unrelated class gets an Outer in the constructor and also have an empty init block.
 *
 * In the empty init block of Unrelated:
 *
 * 1. Try to call property o.a, is it visible for Subclass? why?
 * 2. Try to call property o.b, is it visible for Subclass? why?
 * 3. Try to call property o.c, is it visible for Subclass? why?
 * 4. Try to call property o.d, is it visible for Subclass? why?
 * 5. Try to create an instance of Outer.Nested, is it visible for Subclass? why?
 *    If Nested is visible try to call property e.
 */

fun main() {}

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4
    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    init {
        //Write your code here
    }
}

class Unrelated(o: Outer) {
    init {
        //Write your code here
    }
}