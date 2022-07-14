package summaryIExercise9

// more triforce; function to display a triangle

fun printTriangle(n: Int) {
  val x = "#"
  val y = " "

  for (i in 1..n) {
    repeat(n - i) { // how many times we have to repeat the Space
      print(y)
    }
    repeat (2 * i - 1) { // how many times we have to repeat the #
      print(x)
    }
    println()
  }
}

fun main() {
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/
