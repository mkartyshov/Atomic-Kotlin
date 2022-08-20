package recursionExercise2
import atomictest.eq

fun factorial(n: Long): Long {
    tailrec fun factorial(n: Long, accumulator: Long): Long = // we use accumulator inside tailrec function
        if (n == 1L) accumulator // if n = 1, return 1
        else factorial(n - 1, accumulator * n) // if n != 1, n - 1 and accumulator * n

    return factorial(n, 1)
}

fun main() {
    factorial(1) eq 1
    factorial(3) eq 6
    factorial(4) eq 24
    factorial(11) eq 39916800
}
