package stringTemplatesExercise1

//displaying the result of the function findMax by using a String template

fun findMax(first: Int, second: Int): Int =
  if (first > second) first else second

fun main() {
  val first = 17
  val second = 31
  println("The maximum of $first and $second is " + "${findMax(first, second)}.") // 31
}
