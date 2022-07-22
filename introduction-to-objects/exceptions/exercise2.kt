package exceptionsExercise2
import atomictest.capture
import atomictest.eq

fun abort(s: String) { // function takes Strong, then throws an Exception object
  throw Exception(s) // we pass the abort() argument to the Exception constructor
}

fun main() {
  capture { // we use capture to verify the result
    abort("Stop!") // call abort with an argument
  } eq "Exception: Stop!" // the result is the same as this
}
