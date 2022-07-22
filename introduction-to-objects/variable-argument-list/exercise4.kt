package variableArgumentListsExercise4
import atomictest.eq

fun flatten(listOfLists: List<List<String>>): List<String> {
  val a = mutableListOf<String>() // we created a mutable list that we can modify
  for (list in listOfLists) { // for every list in listOfLists
    a.addAll(list) // we add it in our a list
  }
  return a // return it
}

fun main() {
  val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
  flatten(listOfLists) eq listOf("a", "b", "c", "d")
}
