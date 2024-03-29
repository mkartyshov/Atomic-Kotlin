package operationsOnCollectionsExercise2
import atomictest.eq

val operation = { x: Int ->
  x.toString().contains('5') // implement operation on int converted to string, that contains 5 in a string
}

fun main() {
  val first = listOf(1, 5, 32, 45, 70, 511)
  first.any(operation) eq true
  first.all(operation) eq false
  first.none(operation) eq false
  first.count(operation) eq 3
}
