package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c // sum of three integer

fun main() { // testing
  sum(3, 5, 12) eq 20
  sum(0, 0, 0) eq 0
  sum(1, 1, 1) eq 3
  sum(10, -10, 0) eq 0
  sum(3, 4, 5) eq 12
  sum(3, 5, 12) neq 120
  sum(0, 0, 0) neq 50
  sum(1, 1, 1) neq 23
  sum(10, -10, 0) neq 20
  sum(3, 4, 5) neq Int.MAX_VALUE
}
