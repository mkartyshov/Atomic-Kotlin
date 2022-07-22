package setsExercise1
import atomictest.eq

fun hasUniqueCharacters(s: String): Boolean {
  return s.length == s.toSet().size // compare the original s String with s converted to set of chars
}

fun main() {
  hasUniqueCharacters("abcd") eq true
  hasUniqueCharacters("abcb") eq false
}
