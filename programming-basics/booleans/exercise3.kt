package booleansExercise3

// writing the functions using only if expression. Taking two boolean and returning the same result as built-in operators

fun and(b1: Boolean, b2: Boolean): Boolean =
  if (b1) b2 else false

fun or(b1: Boolean, b2: Boolean): Boolean =
  if (b1) true else b2

fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}
