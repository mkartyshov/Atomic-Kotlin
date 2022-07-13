package summaryIExercise2

// creating a function to return String containing every other letter

fun other(s: String): String {
  var blank = "" // taking a blank string
  var x = 0 // setting the first letter in an s string
  for (c in s) {
    if (x % 2 == 0) {
      blank += c // if letter's number is % 2 = 0, then we put it in blank string
    }
    x++ // going to the next letter
  }
  return blank
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/
