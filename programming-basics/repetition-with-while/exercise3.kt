package repetitionWithWhileExercise3

// writing a function that sums only even numbers

fun sumOfEven(n: Int): Int {
  var sumOfEven = 0
  var x = 0
  while (x <= n) {
    if (x % 2 == 0) {
      sumOfEven += x
    }
    x ++
  }
  return sumOfEven
}

fun main() {
  println(sumOfEven(10))  // 30
}
