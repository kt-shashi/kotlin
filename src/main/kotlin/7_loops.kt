//1. Natural numbers from 1-range
//2. Printing array
//3. Increment 2 in loop (step)
//4. Print in reverse

fun main() {

//    loop1(10)

//    var randomArray = arrayOf<Any>(290, "Apple", false)
//    loop2(randomArray)

    loop3(10)
    loop4(20)

}

fun loop1(n: Int) {

    for (i in 1..n)
        print("$i ")

    println()

    var i: Int = 1
    while (i <= n)
        print("${i++} ")

    i = 1;
    println()
    do {
        print("${i++} ")
    } while (i <= n)

    println()
}

fun loop2(randomArray: Array<Any>) {

    for (i in 0..randomArray.size - 1)
        print("${randomArray[i]} ")

    println()

    for (i in randomArray)
        print("$i ")

    println()
}

fun loop3(n: Int) {

    for (i in 0..n step 2)
        print("$i ")

    println()

}

fun loop4(n: Int) {

    for (i in n.downTo(1))
        print("$i ")
    println()
}

/*

syntax:

for(iterations)
{
    //operations
}

while syntax:
while(iteration)
{
    //operations
    increment
}

do while syntax:
do{
    //operations
    //increment
}while(condition)
*/