package lambdasExercise1
import atomictest.eq

fun transform(list: List<String>): List<Int> =
  list.map { it.length } // count the number of characters in a String from List

fun main() {
  transform(listOf("abc", "ab")) eq listOf(3, 2)
  transform(listOf("", "abdef", "x")) eq listOf(0, 5, 1)
  transform(listOf("123456789")) eq listOf(9)
}
