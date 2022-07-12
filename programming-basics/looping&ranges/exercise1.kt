package loopingAndRangesExercise1

// factorial function

fun factorial(n: Int): Long {
  var factorial = 1L
  for (i in 1..n) {
    factorial *= i
  }
  return factorial
}

fun main() {
  println(factorial(10))  // 3628800
}
