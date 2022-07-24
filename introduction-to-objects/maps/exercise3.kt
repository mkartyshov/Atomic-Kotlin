package mapsExercise3
import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters: MutableMap<String, Hamster> =
    mutableMapOf() // now we change list to map

  fun put(hamster: Hamster): Boolean =
    if (hamsters.size == maxCapacity) // if Cage is full then false, we can't add hamster
      false
    else {
      hamsters[hamster.name] = hamster // if there's place in cage, then add hamster there
      true
    }

  fun get(name: String): Hamster =
    hamsters.getValue(name) // using getValue to get hamster's name
}

fun main() {
  val cage = Cage(2)
  cage.put(Hamster("Alice")) eq true
  cage.get("Alice") eq "Hamster('Alice')"
  capture {
    cage.get("Bob")
  } eq "NoSuchElementException: " +
    "Key Bob is missing in the map."
}
