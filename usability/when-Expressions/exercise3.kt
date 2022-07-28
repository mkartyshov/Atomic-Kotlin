package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var x = 0
  for (c in input) {
    when (c) { // for every ( we add 1, for every ) we subtract 1. In the end we should have zero 
      '(' -> x++
      ')' -> x--
      ' ' -> {}
      else -> throw IllegalArgumentException("The string must consist only of parentheses and whitespace")
    }
    if (x < 0) return false // if x becomes less than 0, it means that our string is unbalanced; it should start with (, not with )
  }
  return x == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}
