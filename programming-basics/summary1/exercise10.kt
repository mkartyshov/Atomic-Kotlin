package summaryIExercise10

// a function to display a table filled with sequential numbers in a form of snake

fun showSnake(rows: Int, columns: Int) {
  val spaces = (rows * columns).toString().length + 1 // calculate the spaces before the number
  for (i in 0 until rows) { // number of rows
    for (x in 0 until columns) {
      val digit = if (i % 2 == 0) { // even or odd row
        i * columns + x // for the first row
      } else {
        i * columns + (columns - 1 - x) // for the second row
      }
      print("%${spaces}d".format(digit))
    }
    println() // ending the row
  }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/
