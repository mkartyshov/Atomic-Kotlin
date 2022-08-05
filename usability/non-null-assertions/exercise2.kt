package nonNullAssertionsExercise2
import atomictest.*

fun List<Int>.headPlusTail(): Triple<Int?, Int?, Int?> =
    when {
        isEmpty() -> Triple(null, null, null) // when list is empty, return null
        size == 1 -> Triple(first(), null, first()) // when list contains single int, return first null first
        else -> Triple(first(), last(), first() + last()) // in other case return first last first+last
    }

fun main() {
    val ints = mutableListOf<Int>() // create a mutable list of ints
    trace(ints.headPlusTail())
    for (n in -2..10 step 2) { // skipping every other element in -2..10
        ints.add(n) // add n to ints list
        trace(ints.headPlusTail())
        trace(ints.headPlusTail()!!.third) // third not null
    }
    trace eq """
    (null, null, null)
    (-2, null, -2)
    -2
    (-2, 0, -2)
    -2
    (-2, 2, 0)
    0
    (-2, 4, 2)
    2
    (-2, 6, 4)
    4
    (-2, 8, 6)
    6
    (-2, 10, 8)
    8
  """
}
