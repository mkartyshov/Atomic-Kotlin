package ifExpressionsExercise2

// function that returns the absolute value of parameter

fun abs(number: Int): Int =
  if (number > 0)
    number
  else
    number * -1

fun main() {
  println(abs(-19))  // 19
}
