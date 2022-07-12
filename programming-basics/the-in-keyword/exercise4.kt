package theInKeywordExercise4

// checking if string parameter is a valid identifier: non-empty, using only letters, underscores, digits;
// starts with a letter or underscore

fun isValidCharacter(ch: Char): Boolean = ch in 'a'..'z' || ch in 'A'..'Z' || ch in '0'..'9' || ch == '_'

fun isValidIdentifier(s: String): Boolean {
  if (s[0] in '0'..'9' || s.isEmpty()) return false
  for (ch in s) {
    if (!isValidCharacter(ch)) return false
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}
