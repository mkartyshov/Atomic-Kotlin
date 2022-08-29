package baseClassInitializationExercise3
import atomictest.trace

open class Animal(val sound: String = "???") // open class Animal

class Cat(sound: String = "meow") : Animal(sound) // inherited class Cat that passes a sound value to the Animal class

class Dog(sound: String = "woof") : Animal(sound) // inherited class Dog that passes a sound value to the Animal class

fun main() {
  val animal = Animal()
  trace(animal.sound)
  val cat = Cat()
  trace(cat.sound)
  val dog = Dog()
  trace(dog.sound)
  trace eq "??? meow woof"
}
