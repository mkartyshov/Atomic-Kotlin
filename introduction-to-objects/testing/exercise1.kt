package testingExercise1
import atomictest.eq

fun abs(number: Int): Int = if (number > 0) number else -number // function that returns the absolute value

fun main() { // testing the function abs
  abs(0) eq 0
  abs(42) eq 42
  abs(-239) eq 239
}
