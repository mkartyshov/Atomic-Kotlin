package objectsEverywhereExercise4

fun reverseDecimal(number: Int): Int =
  number.toString().reversed().toInt() // convert int to string, then reverse, then to int

fun main() {
  println(reverseDecimal(1234))  // 4321
}
