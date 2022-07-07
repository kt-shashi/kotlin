fun main() {

    // storing function in variables
    var add: (Int, Int) -> Int = ::addition
    var subtract: (Int, Int) -> Int = ::subtraction
    var multiply: (Int, Int) -> Int = ::multiplication
    var divide: (Int, Int) -> Int = ::division

    // Input
    println("-----MENU------")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")
    println("Enter choice: ")
    var choice = Integer.valueOf(readLine())

    println("Enter a: ")
    var a: Int = Integer.valueOf(readLine())
    println("Enter b: ")
    var b: Int = Integer.valueOf(readLine())

    when (choice) {
        1 -> println(add(a, b))
        2 -> println(subtract(a, b))
        3 -> println(multiply(a, b))
        4 -> println(divide(a, b))
        else -> println("Invalid response")
    }

}

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun subtraction(a: Int, b: Int): Int {
    return a - b
}

fun multiplication(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Int, b: Int): Int {
    return a / b
}
