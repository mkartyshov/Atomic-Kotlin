package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var result = 0 // sum of numbers
  for (input in n) {
    val number = input.toIntOrNull() // convert input to Int or Null
    if (number == null) {
      trace("Not a number: $input") // if input is null => trace "not a number"
    } else {
      result += number // if input is Int, then add it to the result
    }
    if (number == 0) break // if we have a "0" in vararg => break
  }
  trace("Sum: $result") // sum of numbers before 0
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19") // 19 won't be added cause we break for loop
  trace eq """
    Not a number: a
    Sum: 14
  """
}
