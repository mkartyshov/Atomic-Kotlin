package nullableTypesExercise2

fun zilch(): String? = null // call function that returns null
fun zilch2(): String? = zilch() // call function that return the result of zilch fun

fun main() {
  var x = zilch() // call zilch
  var y = zilch2() // call zilch2
}
