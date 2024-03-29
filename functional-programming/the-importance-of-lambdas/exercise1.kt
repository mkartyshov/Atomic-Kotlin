package theImportanceOfLambdasExercise1
import atomictest.eq

class Person(val name: String, val age: Int)

fun List<Person>.getNamesOfAdults(): List<String> =
    filter { it.age > 17 }.map { it.name } // return the names of people older than 17

fun main() {
  val people = listOf(Person("Alice", 17), Person("Bob", 19))
  people.getNamesOfAdults() eq listOf("Bob")
}
