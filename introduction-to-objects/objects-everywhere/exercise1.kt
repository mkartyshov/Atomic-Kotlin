package objectsEverywhereExercise1

fun isPalindrome(s: String): Boolean = 
  s == s.reversed() // check if String is equal to its reversed version

fun main() {
  println(isPalindrome("mom"))     // true
  println(isPalindrome("street"))  // false
}
