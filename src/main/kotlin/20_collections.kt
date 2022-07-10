fun main() {

//    arrays()

//    immutable()
    mutable()

}

fun arrays() {
    // Array is MUTABLE (Can be edited)
    // But the SIZE is CONSTANT

    // Initialize the array of size 5 with all initialized to 0
    var myArray = Array<Int>(5) { 0 }

    myArray[3] = 10
    myArray[4] = 20

    println()
    for (i in myArray)
        print("$i ")

    println()
    for (i in 0..myArray.size - 1)
        print(myArray.get(i).toString() + " ")
}

fun immutable() {

//    immutablelist()
//    immutableMap()

}

fun mutable() {

//    mutableList()
//    mutableMap()
}

fun immutablelist() {

    // List are IMMUTABLE
    // Once created, cannot be edited, i.d. REAL ONLY

    var list = listOf<String>("Apple", "Banana", "Mango", "Orange")

    for (i in list)
        print("$i ")
    println()

    for (i in 0..list.size - 1)
        print("${list.get(i)} ")
}

fun mutableList() {

//    var list = mutableListOf<String>("Apple", "Banana", "Mango")
    var list = arrayListOf<String>("Apple", "Banana", "Mango")
//    var list = ArrayList<String>()
    list.add("Apple")
    list.add("Banana")
    list.add("Mango")
    list.add("Orange")

    // Remove banana and add Grape at its place
    list.remove("Banana")
    list.add(1, "Grape")

    for (i in list)
        print("$i ")
    println()

    for (i in 0..list.size - 1)
        print("${list.get(i)} ")
}

private fun immutableMap() {

    var myMap = mapOf<String, String>("p1" to "idk1", "p2" to "idk2")

    for (i in myMap)
        println(i.key + " " + i.value)

    for (key in myMap.keys)
        println(key + " " + myMap[key])

}

private fun mutableMap() {
    var myMap = HashMap<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size
//    var myMap = mutableMapOf<Int, String>() // Mutable, READ and WRITE both, No Fixed Size
//    var myMap = hashMapOf<Int, String>()      // Mutable, READ and WRITE both, No Fixed Size

    myMap.put(4, "Yogi")
    myMap.put(43, "Manmohan")
    myMap[7] = "Vajpayee"
    myMap[43] = "Modi"

    for (i in myMap)
        println("${i.key} ${i.value}")

    for (key in myMap.keys)
        println("Element at $key = ${myMap[key]}")

    for (key in myMap.keys)
        println("Element at $key = ${myMap.get(key)}")

}

// Collections

// 1. IMMUTABLE collections (READ ONLY)
//    - List: listOf
//    - Map: mapOf
//    - Set: setOf

// 2. MUTABLE collections (READ and WRITE)
//    - List: ArrayList, arrayListOf, mutableListOf
//    - Map: HashMap, hashMapOf, mutableMapOf
//    - Set: hashSetOf, mutableSetOf