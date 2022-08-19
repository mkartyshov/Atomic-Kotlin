package foldingListsExercise1
import atomictest.eq

fun <T> List<T>.size(): Int =
  fold(0) { length, _ -> length + 1 } // returns the number of elements in a List

fun main() {
  val list = listOf(1, 2, 3)
  list.size() eq 3
}
