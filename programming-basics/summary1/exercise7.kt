package summaryIExercise7

fun countDigits(number: Int, digit: Int): Int {
  var worker = number
  var occurrences = 0
  while (worker > 0) {
    if (worker % 10 == digit) { // if digit is inside number
      occurrences ++ // counting the digit
    }
    worker /= 10 // remove one digit
  }
  return occurrences
}

fun main() {
  println(countDigits(764241, 4)) // 2
}
