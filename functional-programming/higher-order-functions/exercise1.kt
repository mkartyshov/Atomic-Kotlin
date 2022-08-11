package higherOrderFunctionsExercise1
import atomictest.eq

fun <T, R> List<T>.map(transform: (T) -> R): List<R> { // function returns a transformed list
  val result = mutableListOf<R>() // final result is transformed list
  for (e in this) { // for elements in original list
    result += transform(e) // add transformed elements to the result list
  }
  return result // return the final result
}

fun main() {
  val list = listOf(1, 2, 3)
  list.map { "$it!" } eq listOf("1!", "2!", "3!")
}
