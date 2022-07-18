package objectsEverywhereExercise2

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase()) // calling the previous function and adding lowercase condition

fun main() {
  println(isPalIgnoreCase("Mom"))  // true
}
