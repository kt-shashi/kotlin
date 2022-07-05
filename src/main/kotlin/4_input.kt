fun main() {

    var age: Int

    println("Enter name: ")
    var name = readLine()
    println("Enter age: ")
    age = Integer.valueOf(readLine())

    printData(name.toString(), age)
}

fun printData(name: String, age: Int) {
    println("Name: $name")
    println("Age: $age")
}

