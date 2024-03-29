package nullableTypesExercise1
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters: MutableMap<String, Hamster> =
    mutableMapOf()

  fun put(hamster: Hamster): Boolean =
    if (hamsters.size == maxCapacity)
      false
    else {
      hamsters[hamster.name] = hamster
      true
    }

  fun get(name: String): Hamster? =
    hamsters[name] // get name of the hamster from the Cage; if there's no hamster with specific name => null
}

fun main() {
  val cage = Cage(1)
  cage.get("Alice") eq null
}
