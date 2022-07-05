fun main() {

//    1 to 5
    val range1 = 1..5

//    5 to 1
    val range2 = 5 downTo 1

//    20 to 0 but only even numbers
    val range3 = 20 downTo 0 step 2

//    19 to 1 but only odd
    val range4 = 19 downTo 1 step 2

//    Range with string
    val r4 = "a".."z"

//    Range with characters
    val r5 = 'a'..'z'

//    check if char c is present in r5
    if ('c' in r5)
        println("C is present")
}