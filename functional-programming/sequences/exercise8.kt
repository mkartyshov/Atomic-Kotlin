package sequencesExercise8
import atomictest.eq

fun fibonacci(): Sequence<Int> {
    var previous = 1
    return generateSequence(0) { current -> // start with current
        val next = previous + current // next is sum of previous (1) and current
        previous = current // previous now equals current
        next // generate sequence next
    }
}

fun main() {
    fibonacci().take(10).toList() eq
            listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
}
