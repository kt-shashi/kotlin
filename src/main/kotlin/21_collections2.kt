/** FILTER
 *
 * { it's lambda will return boolean value, which helps to determine
 *   whether to add the element oto list or not }
 *
 * Returns a list containing only elements matching the given [predicate]
 * */

/** MAP
 *
 * { it's lambda will return modified value }
 *
 * Returns a list containing the results of applying the given [transform] function
 * to each element in the original collection
 * */

fun main(args: Array<String>) {

    filterAndMap()

}

private fun filterAndMap() {

    // Filter
    val myNumbers: List<Int> = listOf(2, 3, 4, 6, 23, 90)

    val mySmallNums = myNumbers.filter { it < 10 }    // OR { num -> num < 10 }
    for (num in mySmallNums) {
        println(num)
    }

    // Map
    val mySquaredNums = myNumbers.map { it * it }     // OR { num -> num * num }
    for (num in mySquaredNums) {
        println(num)
    }

    // Filter + map
    var people = listOf<Pperson>(Pperson(10, "Steve"), Pperson(23, "Annie"), Pperson(17, "Sam"))
    var names = people.filter { person -> person.name.startsWith("S") }.map { it.name }

    for (name in names) {
        println(name)
    }
}

class Pperson(var age: Int, var name: String) {
    // Some other code..
}
