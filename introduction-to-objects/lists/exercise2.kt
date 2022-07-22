package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var x = 0
  for (i in list) {
    if (number == i) { // if our number is part of the list, then x + 1
      x ++
    }
  }
  return x // by the end we have the right amount of numbers
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}
