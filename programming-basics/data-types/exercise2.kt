package dataTypesExercise2

// combining different data types

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val answer1: String = string + int
  val answer2: String = string + double
  val answer3: String = string + boolean
  val answer4: String = string + character

  val answer5: Double = int + double
  val answer6: Double = double + int
  val answer7: Char = character + int
  val answer8: String = character + string

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  // val wrong1 = int + character
  // val wrong2 = double + character
  // val wrong3 = boolean + boolean
}
