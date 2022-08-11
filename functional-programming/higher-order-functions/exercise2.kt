package higherOrderFunctionsExercise2
import atomictest.eq

fun List<Int>.transformVersion1(): List<Int> =
  filter { it % 2 == 0 }.map { it * it } // we use filter to find element from list; multiply it by itself

fun List<Int>.transformVersion2(): List<Int> =
  mapNotNull { if (it % 2 == 0) it * it else null } // we use if else to get the same result

fun main() {
  val list = listOf(1, 2, 3)
  list.transformVersion1() eq listOf(4)
  list.transformVersion2() eq listOf(4)
}
