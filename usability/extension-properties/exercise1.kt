package extensionPropertiesExercise1
import atomictest.eq

val <T> List<T>.secondOrNull: T?
  get() = getOrNull(1) // extension property returns the second element from List

val <T> List<T>.penultimateOrNull: T?
  get() = getOrNull(size - 2) // extension property returns the penultimate element from List

fun main() {
  val ints = listOf(1, 2, 3)
  ints.secondOrNull eq 2
  ints.penultimateOrNull eq 2

  val strings = listOf("a", "b", "c", "d")
  strings.secondOrNull eq "b"
  strings.penultimateOrNull eq "c"
}
