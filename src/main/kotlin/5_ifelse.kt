//1. divide a by b
//2. find greater number
//3. check if number is 4
//4. check if number lies between 10-20

fun main() {

    var ans1: Double

    // Problem 1

    var a: Int
    var b: Int
    println("problem 1: a/b")
    println("Enter number 1")
    a = Integer.valueOf(readLine())
    println("Enter number 2")
    b = Integer.valueOf(readLine())
    ans1 = div(a, b)

    if (ans1 == -1.0)
        println("Cannot divide by 0")
    else
        println("Result: $ans1")

    println("Problem2")
    var ans2 = findGreaterNumber(a, b)
    println("Greater number is: $ans2")

    println("Problem3")
    var ans3 = checkIf4(b)
    if (ans3)
        println("Number equal to 4")

    println("Problem4")
    var ans4 = problem4(a)
    if (ans4)
        println("Number lies between 10 and 20")

}

fun div(a: Int, b: Int): Double {
    if (b == 0)
        return -1.0;
    else
        return a.toDouble() / b;
}

fun findGreaterNumber(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun checkIf4(n: Int): Boolean {
//    return n==4

    return when (n) {
        4 -> true
        else -> false
    }
}

fun problem4(n: Int): Boolean {

    var x = 10..20
    return n in x

}

