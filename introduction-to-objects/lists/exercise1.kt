package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var x = 0
  for (i in list) { // we select all the elements in list
    if (x <= i) { // if x is less then number in list, we go to the next number
      x = i // we make x the next number
    }
  }
  return x // by the end of the list, x will have the value of the maximum number in list
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}
