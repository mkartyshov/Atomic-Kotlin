package extensionFunctionsExercise2
import atomictest.eq

fun Int.isOdd(): Boolean = this % 2 != 0 // check for odd

fun Int.isEven(): Boolean = this % 2 == 0 // check for even

fun main() {
  1.isOdd() eq true
  2.isEven() eq true
  13.isEven() eq false
}
