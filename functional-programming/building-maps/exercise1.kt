package buildingMapsExercise1
import atomictest.eq

data class Person(val name: String, val age: Int)

fun demographic(people: List<Person>): Map<Int, List<String>> {
  return people.groupBy(Person::age).mapValues { (_, group) -> group.map(Person::name) } // return map with age as key and list of names as value
}

fun main() {
  val people = listOf(Person("Alice", 21),
    Person("Bob", 25), Person("Charlie", 25))

  demographic(people) eq
    mapOf(21 to listOf("Alice"),
      25 to listOf("Bob", "Charlie"))
}
