package manipulatingListsExercise6
import atomictest.eq

fun <T> List<List<T>>.flatten(): List<T> =
  flatMap { it.toList() } // convert list of lists to one list

fun main() {
  val listOfLists = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

  listOfLists.flatten() eq listOf(1, 2, 3, 4, 5, 6)
}
