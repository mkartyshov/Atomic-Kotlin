package safeCallsAndTheElvisOperatorExercise1
import atomictest.eq

fun downcase(str: String?): String = str?.lowercase() ?: "" // lowercase str, if str is null => ""

fun main() {
  downcase(null) eq ""
  downcase("ABC") eq "abc"
}
