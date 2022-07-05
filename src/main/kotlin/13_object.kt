// object keyword is used to create static class  in Kotlin
// all variables and method in it will become static as well

fun main() {

    Shashi.id = 100

    println("Id ${Shashi.returnId()}")

}

object Idk {

    // Behaves like a STATIC variable
    var id: Int = 10

    // Behaves like a STATIC method
    fun returnId(): Int {
        return id;
    }
}

// When inherited

open class Employee() {
    open var id: Int = 0

    open fun returnId(): Int {
        return id;
    }
}

object Shashi : Employee() {

    // Behaves like a STATIC variable
    override var id: Int = 10

    // Behaves like a STATIC method
    override fun returnId(): Int {
        return id;
    }
}