package destructuringDeclarationsExercise1
import atomictest.eq

fun calculate(
  n1: Int, n2: Int
): Triple<Boolean, Int, Int> {
  return if (n1 < 0 || n2 < 0) // return Triple if n1 or n2 is less than zero
    Triple(false, 0, 0)
  else // return Triple if n1 or n2 is grater than zero
    Triple(true, n1 + n2, n1 * n2)
}

fun main() {
    val result = calculate(5, 7)
    result.first eq true
    result.second eq 12
    result.third eq 35
    val (success, plus, multiply) =
            calculate(11, 13)
    success eq true
    plus eq 24
    multiply eq 143
}
