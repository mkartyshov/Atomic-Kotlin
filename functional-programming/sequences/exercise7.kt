package sequencesExercise7

fun oddWithoutDigitOne(): Sequence<Int> {
  return generateSequence(3) { it + 2 } // sequence of odd numbers starting with 3
    .filter { '1' !in it.toString() } // if number has digit '1', we filter it
}

fun main() {
  println(oddWithoutDigitOne().take(20).sum()) // sum of the first 20 elements of the sequence
}
