package introductionToGenericsExercise2
import atomictest.eq

fun <T> List<T>.reversed(): List<T> {
  val result = mutableListOf<T>()
  for (i in lastIndex downTo 0) { // iterate through indices in reverse order
    result += get(i) // get i from old List to result in correct order
  }
  return result
}

fun main() {
  val list = listOf(1, 2, 3)
  list.reversed() eq listOf(3, 2, 1)
}
