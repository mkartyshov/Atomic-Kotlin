package extensionPropertiesExercise2
import atomictest.eq

val <T> List<T>.reversed: List<T> // function to reverse list as an extension property
    get() = reversed()

fun main() {
  val list = listOf(1, 2, 3)
  list.reversed eq listOf(3, 2, 1)
}
