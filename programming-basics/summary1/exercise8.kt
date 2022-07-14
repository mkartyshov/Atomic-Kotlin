package summaryIExercise8

// function to reverse the digits in a decimal number using a while loop.

fun reverseDecimal(number: Int): Int {
  var worker = number
  var reversed = 0

  while (worker != 0) {
    val digit = worker % 10 // taking the last digit from number
    reversed = reversed * 10 + digit // now the last digit is the first one
    worker /= 10 // making the number one digit shorter
  }
  return reversed
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}
