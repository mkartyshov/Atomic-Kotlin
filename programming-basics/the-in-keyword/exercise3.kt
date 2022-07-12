package theInKeywordExercise3

// function checks whether a character is a lowercase letter

fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun main() {
  println(isLowerCase('A'))  // false
  println(isLowerCase('b'))  // true
}
