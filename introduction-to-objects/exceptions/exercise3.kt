package exceptionsExercise3
import atomictest.capture
import atomictest.eq

fun repeatChar(ch: Char, n: Int): String {
  if (n < 0)
    throw IllegalArgumentException("Count 'n' must be non-negative, but was $n.") // if n is non-negative then the function throws an exception
  var x = ""
  repeat(n) { // display ch for n times
    x += ch
  }
  return x
}

fun main() {
  repeatChar('a', 4) eq "aaaa"
  capture {
    repeatChar('c', -2)
  } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}
