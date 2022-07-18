package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var letters = "" // taking the blank string
  for (ch in s) { // for all the characters in string
    if (ch in 'a'..'z' || ch in 'A'..'Z') { // if a ch is a..z or A..Z
      letters += ch // then we put it in letters string
    }
  }
  return isPalIgnoreCase(letters)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}
