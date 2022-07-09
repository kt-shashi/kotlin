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

    immutablelist()


}

fun mutable() {

    mutableList()

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

// Collections

// 1. IMMUTABLE collections (READ ONLY)
//    - List: listOf
//    - Map: mapOf
//    - Set: setOf

// 2. MUTABLE collections (READ and WRITE)
//    - List: ArrayList, arrayListOf, mutableListOf
//    - Map: HashMap, hashMapOf, mutableMapOf
//    - Set: hashSetOf, mutableSetOf