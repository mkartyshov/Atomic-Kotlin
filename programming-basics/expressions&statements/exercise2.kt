package expressionsAndStatementsExercise2

// creating three functions and displaying their types

fun f(x: Int, y: Int) = x + y  // takes two int and returns sum

fun g(ast: String, bst: String) = ast + bst // takes two strings and returns them concatenated

fun h() = println("h()") // displays h()

fun main() {
  val f1: Int = f(5, 3)
  val g1: String = g(ast = "Star", bst = "Wars")
  val h1: Unit = h()
  println("Int \n String \n Unit") // displaying types of functions
}
