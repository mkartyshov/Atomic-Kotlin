package booleansExercise2

// creating a "truth table" for && and ||

fun showAnd(first: Boolean, second: Boolean) {
  println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean) {
  println("$first || $second == ${first || second}")
}

fun showTruthTable() {
  showAnd(true, true)
  showAnd(false, false)
  showAnd(true, false)
  showAnd(false, true)

  showOr(true, true)
  showOr(false, false)
  showOr(false, true)
  showOr(true, false)
}

fun main() {
  showTruthTable()
}
