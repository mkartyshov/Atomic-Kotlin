package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var x = 0
  for (c in input) {
    when (c) {
      '(' -> x++
      ')' -> x--
      ' ' -> {}
      else -> throw IllegalArgumentException("The string must consist only of parentheses and whitespace")
    }
    if (x < 0) return false
  }
  return x == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}
