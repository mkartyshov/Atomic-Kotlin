package loopingAndRangesExercise2

// sum of factorial

fun factorial(n: Int): Long {
  var result = 1L
  for (i in 1..n) {
    result *= i
  }
  return result
}

fun sumOfFactorials(n: Int): Long {
  var sumOfF = 0L
  for (i in 1..n) {
    sumOfF += factorial(i)
  }
  return sumOfF
}

fun main() {
  println(sumOfFactorials(10))  // 4037913
}
