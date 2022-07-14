package summaryIExercise5

// display every fifth number

fun everyFifth(start: Int, end: Int) {
  val range = start..end
  for (i in range) {
    if ((i - start) % 5 == 4) { // if (number in range - first number in range) % 5 = 4 (making it fifth), then we display it
      println(i)
    }
  }
}

fun main() {
  everyFifth(11, 30)
}
