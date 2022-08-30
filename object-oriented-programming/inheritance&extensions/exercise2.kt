package inheritanceAndExtensionsExercise2
import atomictest.*

open class Dog {
  open fun speak() = trace("Bark!")
  open fun sit() = trace("Sitting...")
}

open class RealDog : Dog() {
  fun feed() = trace("Feed")
}

class ToyDog : Dog() {
  override fun speak() = trace("b.a.r.k.")
  fun changeBatteries() = trace("Change batteries")
}

fun Dog.play() { // Dog.play() first calls speak(), then sit():
  speak()
  sit()
}

fun RealDog.play() { // call Dog.play() first, then call feed():
  (this as Dog).play()
  feed()
}

fun ToyDog.play() { // call Dog.play() first, then call changeBatteries():
  (this as Dog).play()
  changeBatteries()
}

fun main() {
  val dog: Dog = ToyDog()
  dog.play()
  trace eq """
    b.a.r.k.
    Sitting...
  """
}
