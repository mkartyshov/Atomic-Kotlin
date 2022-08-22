package complexConstructorsExercise2
import atomictest.eq

class SumChars(text: String) {
    val sum: Int
    init {
        fun calc() = text.sumOf { it.code } // sum up the integer values of chars in text
        sum = calc() // assign result of calc to sum
    }
}

fun main() {
  SumChars("What?").sum eq 467
}
