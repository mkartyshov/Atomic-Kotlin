package summaryIExercise4

// testing Long and Double by incremented them by 1

fun testLong() {
  println(Long.MAX_VALUE + 1)
}

fun testDouble() {
  println(Double.MAX_VALUE + 1)
}

fun testDouble2() {
  println(Double.MAX_VALUE + 1 == Double.MAX_VALUE) // checking if two doubles are equal
}

fun main() {
  testLong()
  testDouble()
  testDouble2()
}
/* Output:
-9223372036854775808
1.7976931348623157E308
true
 */
