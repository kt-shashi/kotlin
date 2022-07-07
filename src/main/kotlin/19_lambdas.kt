// lambdas are functions with no names

var singleLineLambda: (Int) -> Unit = { x -> println(x) }
var singleLineLambda2: (Int) -> Int = { x -> x * x }
var multiLneLambda: (Int) -> Int = { x ->
    println(x)
    x * x// Last line is the return type
}

// If lambda has only one parameter, we can refer to it using 'it' keyword
// which is the implicit name for single parameter
var singleLineLambda3: (Int) -> Int = { it + it }

fun main() {

}