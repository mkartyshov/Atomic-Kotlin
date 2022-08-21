package interfacesExercise3

interface Pet {
  val sound: String // property sound of type String
}
// three different pets produces different strings:
class Dog: Pet {
  override val sound get() = "Bark!"
}

class Cat: Pet {
  override val sound get() = "Meow!"
}

class Hamster: Pet {
   override val sound get() = "Squeak!"
}
// creating list of pets; using map to produce property sound for every pet:
fun main() {
  val pets = listOf(Dog(), Cat(), Hamster())
  pets.map { it.sound }
}
