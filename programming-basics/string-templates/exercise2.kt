package stringTemplatesExercise2

//implement a record() function that returns a String in a specific form

fun record(index: Int, status: String, message: String): String =
  "$index [$status] $message\n"

fun main() {
  print(record(1, "OK", "Everything is fine."))
  print(record(2, "Fail", "Something has broken."))
}

/* Output:
1 [OK] Everything is fine.
2 [Fail] Something has broken.
*/
