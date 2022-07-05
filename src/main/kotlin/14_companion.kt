// Companion object is used to make variables and functions static

fun main() {

    println(Employee1.returnId())

}

class Employee1 {

    companion object {
        // Behaves like a STATIC variable
        var id: Int = 10

        // Behaves like a STATIC method
        fun returnId(): Int {
            return id;
        }
    }

}