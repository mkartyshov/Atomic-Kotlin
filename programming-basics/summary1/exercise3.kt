package summaryIExercise3

fun first(a: Boolean, b: Boolean, c: Boolean): Boolean = // function takes three boolean then And them to produce the result
  if (a) b && c else false

fun second(a: Boolean, b: Boolean, c: Boolean): Boolean = // same as fun first, but Or the parameters
  if (a) true else b || c

fun main() {
  println(first(true, true, true))
  println(first(true, false, true))

  println(second(false, false, false))
  println(second(false, true, false))
}
