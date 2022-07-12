package theInKeywordExercise2

// using step to write a sumOfEven function

fun sumOfEven(n: Int): Int {
  var x = 0
  for (y in 0..n step 2) {
    x += y
  }
  return x
}

fun main() {
  println(sumOfEven(10))  // 30
}
