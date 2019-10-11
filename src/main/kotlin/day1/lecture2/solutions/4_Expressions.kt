package day1.lecture2.solutions

/**
 * Fill in the functions below
 */
fun main() {
    //Dont write your code here
    assert(returnLastNameWithIf("Hadas") == "Peled")
    assert(returnLastNameWithIf("Gil") == "Unknown")

    assert(returnLastNameWithWhenStatement("Hadas") == "Peled")
    assert(returnLastNameWithWhenStatement("Gil") == "Goldzweig")
    assert(returnLastNameWithWhenStatement("Eden") == "Bugdary")
    assert(returnLastNameWithWhenStatement("Refael") == "Unknown")
    //Dont write your code here
}

/**
 * return the person last name using an [if] expression based on first name
 *
 * @return "Peled" if first name is "Hadas"
 * @return "Unknown" if anything else
 */
fun returnLastNameWithIf(firstName: String): String {
    //Write your code below this line
    return if (firstName == "Hadas") {
        "Peled"
    } else {
        "Unknown"
    }
}

/**
 * return the person last name using a [when] expression based on first name
 *
 * @return "Peled" if first name is "Hadas"
 * @return "Goldzweig" if first name is "Gil"
 * @return "Bugdary" if first name is "Eden"
 * @return "Unknown" if the first name is not "Gil" or "Hadas" or "Eden"
 */
fun returnLastNameWithWhenStatement(firstName: String): String {
    //Write your code below this line
    return when (firstName) {
        "Hadas" -> "Peled"

        "Gil" -> "Goldzweig"

        "Eden" -> "Bugdary"

        else -> "Unknown"
    }
}