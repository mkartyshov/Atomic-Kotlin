package repetitionWithWhileExercise2

// creating a function that sums the integral numbers

fun sum(number: Int): Int {
  var sum = 0
  var x = 0
  while (x <= number) {
    sum += x
    x++
  }
  return sum
}

fun main() {
  println(sum(10))  // 55
}
