package loopingAndRangesExercise3

// using a for loop to create a function to sum up only even numbers

fun sumOfEven(n: Int): Int {
  var sumOfEven = 0
  for (i in 1..n) {
    if (i % 2 == 0) {
      sumOfEven += i
    }
  }
  return sumOfEven
}

fun main() {
  println(sumOfEven(10))  // 30
}
