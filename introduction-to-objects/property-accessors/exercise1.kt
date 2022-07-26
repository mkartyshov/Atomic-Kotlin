package propertyAccessorsExercise1

class Hamster(val name: String) {
  override fun toString(): String {
    return "Hamster('$name')"
  }
}

class Cage(private val maxCapacity: Int) {
  private val hamsters =
    mutableListOf<Hamster>()

  val capacity: Int
    get() = maxCapacity - hamsters.size // property to get info about free spaces for new Hamsters in Cage

  val full: Boolean
    get() = hamsters.size == maxCapacity // property that returns a boolean whether the Cage have any space

  val empty: Boolean
    get() = hamsters.size == 0 // property that returns a boolean whether the Cage contains any Hamsters

  fun put(hamster: Hamster): Boolean =
    if (full)
      false
    else {
      hamsters += hamster
      true
    }

  fun takeHamster(): Hamster =
    hamsters.removeAt(0)
}

fun main() {
  val cage = Cage(2)
  // cage.empty eq true
  cage.put(Hamster("Alice"))
  // cage.empty eq false
}
