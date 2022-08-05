package nonNullAssertionsExercise3
import atomictest.eq
import kotlin.math.abs

fun absMinIsMax(list: List<Int>): Boolean {
  if (list.isEmpty()) return false // if list is empty return false
  return abs(list[0])!! == abs(list.last())!! // compare first and last int in list
}

fun main() {
  absMinIsMax(listOf(-10, 1, 10)) eq true
  absMinIsMax(listOf(10, 10)) eq true
  absMinIsMax(listOf(-10, 1)) eq false
}
