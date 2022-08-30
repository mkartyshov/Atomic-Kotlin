package sealedClassesExercise3
import atomictest.eq
import kotlin.random.Random

sealed class Top { // all the subclasses of Top are nested within Top
  class Middle1 : Top()
  class Middle2 : Top()
  open class Middle3 : Top()
  class Bottom3 : Middle3()
}

fun main() {
  Top::class.sealedSubclasses
    .map { it.simpleName } eq
    "[Middle1, Middle2, Middle3]"
  val rand = Random(17) // seeded random-number generator
  Top::class.sealedSubclasses
    .random(rand).simpleName // randomly select a subclass of Top and display its simpleName
}
