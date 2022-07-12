package theInKeywordExercise1

// function to display alphabet

fun getAlphabet(): String {
  var abc = ""
  for (x in 'a'..'z') {
    abc += x
  }
  return abc
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
