import java.math.BigInteger

//fun <function_name> ( <arguments> ) : <return_type>{
//    // statements
//}

fun main(args: Array<String>) {

    // extension function
    var s1 = "A";
    var s2 = "B";
    var s3 = "C";

    println(s3.add(s1, s2))

    // infix function
    var x1 = 10
    var x2 = 20

    // Without infix
//    var max=x1.findMax(x2)

    // With infix
    var max2 = x1 findMax x2
    println(max2)
}

fun printName(name: String) {
    print(name)
}

fun printY(): Unit = print("y")

fun add2nums(a: Int, b: Int): Int {
    return a + b;
}

fun times2(x: Int) = x * 2

// Extension function

//Kotlin extension function provides a facility to "add" methods
// to class without inheriting a class or using any type of design pattern.
// The created extension functions are used as a regular function inside that class.

// Function concatenates 3 strings
fun String.add(s1: String, s2: String): String {
    return this + s1 + s2;
}

// Infix function

//It must be member function or extension function
//It must accept a single parameter

infix fun Int.findMax(x: Int): Int {
    return if (this > x) this
    else x
}

// Tailrec function

// We can use recursion normally, but when the input is very large
// we often run out of memory
// Tailrec simply avoid stackoveflow error by doing some optimization

tailrec fun fibonacci(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n == 0)
        b
    else
        fibonacci(n - 1, a + b, a)
}