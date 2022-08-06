package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<E> {
    private val map = mutableMapOf<E, Int>()

    fun add(element: E) {
        map[element] = (map[element] ?: 0) + 1 // add element to map, if element is already part of map, we increase the counter
    }

    fun count(element: E): Int {
        return map[element] ?: 0 // return number of times element was added to the map
    }
    fun toSet(): Set<E> = map.keys // return a set of stored elements
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
}
