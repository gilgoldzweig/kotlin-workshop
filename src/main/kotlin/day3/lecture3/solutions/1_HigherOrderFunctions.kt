package day3.lecture3.solutions

/**
 * Change the function so that it will:
 *
 * @receiver Extension function on [MutableList] of type [E]
 * @param filter: Lambda function that has a parameter of type [E] and it should return [Boolean]

 * @return A filtered list based on the [filter] lambda
 */
fun <E> MutableList<E>.filter(filter: (E) -> Boolean): MutableList<E> {
    val filteredList = ArrayList<E>()
    for (element in this) {
        if (filter(element)) {
            filteredList.add(element)
        }
    }
    return filteredList
}