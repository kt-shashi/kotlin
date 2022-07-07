// Higher order functions
// Any function which takes a function as parameter or returns a function

fun main() {

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
        1 -> calculate(a, b, ::add)
        2 -> calculate(a, b, ::subtract)
        3 -> calculate(a, b, ::multiply)
        4 -> calculate(a, b, ::divide)
        else -> println("Invalid response")
    }

}

fun printResult(x: Int): Unit {
    println("Result: $x")
}

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Unit {
    val result = operation(a, b)
    return printResult(result)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Int {
    return a / b
}
