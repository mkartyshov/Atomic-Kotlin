package nullableTypesExercise3
import atomictest.eq

fun countHexadecimalNumbers(codes: List<String>): Map<Int, Int> {
  val result = mutableMapOf<Int, Int>() // final result is a map
  for (s in codes) { // jump to strings in codes
    val value = s.toIntOrNull(16) // convert strings to Int or Null
    if (value != null) { // for Ints that are not null
      val count = result[value] 
      result[value] = if (count == null) 1 else count + 1 // number of occurrences we have for this Int in List
    }
  }
  return result
}

fun main() {
  countHexadecimalNumbers(listOf(
    "1", "3", "7", "8", "A", "B", "F")) eq
    mapOf(1 to 1, 3 to 1, 7 to 1, 8 to 1, 10 to 1, 11 to 1, 15 to 1)

  countHexadecimalNumbers(listOf("1A", "1A", "1A")) eq
    mapOf(26 to 3)

  countHexadecimalNumbers(listOf("Q")) eq mapOf()
}
