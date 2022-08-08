package theImportanceOfLambdasExercise2
import atomictest.eq

fun filterNonBlank(strings: List<String>): List<String> =
  strings.filter { it.isNotBlank() } // remove all the blanks from the list of strings

fun main() {
  filterNonBlank(listOf("", "a", "  ")) eq listOf("a")
}
