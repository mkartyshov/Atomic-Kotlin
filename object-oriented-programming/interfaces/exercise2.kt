package interfacesExercise2

interface Pet { // pet interface
  fun speak(): String // function returns a string
}
// three different pets produces different strings:
class Dog: Pet {
    override fun speak() = "Bark!"
}

class Cat: Pet {
    override fun speak() = "Meow!"
}

class Hamster: Pet {
    override fun speak() = "Squeak!"
}
// creating list of pets; using map to produce result of speak for every pet:
fun main() {
  val pets = listOf(Dog(), Cat(), Hamster())
  pets.map { it.speak() }
}
