package higherOrderFunctionsExercise4

fun <A, B, C> ((A) -> B).andThen(action: (B) -> C): (A) -> C =
  { a: A -> action(this(a)) } // combine actions of two functions

fun main() {
  val multiply2: (Int) -> Int = { x: Int -> x * 2 }
  val println: (Int) -> Unit = { i: Int -> println("Result: $i") }

  val composition = multiply2.andThen(println) // we first multiply Int by 2 and after that return the result as a printed String
  composition(5)
}
/* Output:
Result: 10
*/
