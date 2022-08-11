package higherOrderFunctionsExercise3
import atomictest.eq

fun <T, R : Any> Iterable<T>.mapIndexedNotNull(
  transform: (Int, T) -> R?
): List<R> {
  val result = mutableListOf<R>()
  for ((index, e) in withIndex()) {
    val transformed = transform(index, e) // we transform not only element, but also index of this element
    if (transformed != null) {
      result += transformed // if transformed is not null, add it to result
    }
  }
  return result
}

fun main() {
  val list = listOf("a", "b", "c", "d")
  list.mapIndexedNotNull { index, s ->
    if (index % 2 == 0) "$s!" else null // for example we can use index to transform only some of the elements 
  } eq listOf("a!", "c!")
}
