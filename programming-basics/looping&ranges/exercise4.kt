package loopingAndRangesExercise4

// newfags can't triforce

fun showHalfTriangle(n: Int) {
  var x = "#"
  for (i in 1..n) {
    repeat(i) {
      print("$x")
    }
    println()
  }
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/
