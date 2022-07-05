fun main() {

    var dog=Dog("Beagle","white and Brown")
    dog.printDog()
    dog.eat()
}

open class Animal(var color:String) {
    open fun eat() {
        println("Animal Eating")
    }
}

class Dog(private var breed:String, color:String) : Animal(color) {

    // Since parent class also contains this
    // If we want to call this, the function must be overridden
    override fun eat() {
        println("Dog is eating")
    }

    fun printDog() {
        println("Breed: $breed")
        println("Color: $color")
    }
}