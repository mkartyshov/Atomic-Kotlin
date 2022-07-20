package constructorsExercise1

class Floating(val d: Double) { // class Floating contains a val d of type Double
  override fun toString(): String { // convert Double to String
    return "$d" // return the String
  }
}

fun main() {
  val result = Floating(1.1)
  println(result) // display the String
}
