//Class syntax:

// class <ClassName>{
//    // Class body
// }

// Primary Constructor
class Customer(name: String) {

}

// If you want to perform something in Constructor, we use init block

//The init block is always called after the primary constructor
//A class file can have one or more init blocks executing in series i.e. one after another.

class Customer2(name: String) {
    var name: String = ""

    init {
        this.name = name
        println("Name: $name")
    }
}

// declare property in constructor
class Customer3(var name: String) {
    init {
        println("Name: $name")
    }
}

// understanding secondary constructor
// 1. Secondary constructor cannot create properties
// 2. Secondary constructor must explicitly call primary constructor
// 3. Secondary constructor body is called after init block

class Student(var name:String){

    var id:Int = 0

    init {

    }

    constructor(name:String,id:Int):this(name){
        this.id=id
        println("name: $name")
        println("id: $id")
    }
}

fun main() {

    var c1 = Customer2("Shashi")
    var c2 = Customer3("Shashi")
    var c3 = Student("Shashi",10)

}