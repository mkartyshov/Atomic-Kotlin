package manipulatingListsExercise5
import atomictest.eq

fun <T, R> List<T>.flatMap(f: (T) -> List<R>): List<R> =
  map(f).flatten() // convert map to list of all elements

fun main() {
  val list = listOf(3, 1, 4)

  list.flatMap { (0..it).toList() } eq // return all the elements from list and then list them in specific way
    listOf(0, 1, 2, 3, 0, 1, 0, 1, 2, 3, 4)
}
