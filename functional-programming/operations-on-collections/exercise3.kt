package operationsOnCollectionsExercise3
import atomictest.eq

fun sum(list: List<Int?>): Int =
  list.filterNotNull().sum() // sum of ints in list, that are not null (null could be zero)

fun main() {
  sum(listOf(1, 2, null)) eq 3
}
