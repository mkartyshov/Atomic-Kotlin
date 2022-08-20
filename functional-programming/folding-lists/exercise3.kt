package foldingListsExercise3
import atomictest.eq

fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean =
  fold(false) { found, element ->
    if (predicate(element)) true else found // if element is predicate return true, else try again
  }

fun main() {
  val list = listOf(1, -2, 3)
  list.any { it < 0 } eq true
}