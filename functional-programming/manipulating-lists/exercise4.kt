package manipulatingListsExercise4
import atomictest.eq

class Person(
  val name: String
) {
  val friends: MutableList<Person> = mutableListOf()

  override fun toString() = "($name, friends: ${friends.map { it.name }})"
}

fun friendSuggestions(person: Person): Set<Person> { // return friends of friends of person
  return (person.friends.flatMap { it.friends }.toSet() - person.friends - person) // return set of friends of friends a person - person.friends - person
}

fun main() {
  val alice = Person("Alice")
  val bob = Person("Bob")
  val charlie = Person("Charlie")

  alice.friends += bob
  bob.friends += alice
  bob.friends += charlie
  charlie.friends += bob

  friendSuggestions(alice) eq setOf(charlie)
}
