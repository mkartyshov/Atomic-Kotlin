package testingExercise3
import atomictest.eq
import atomictest.neq

fun squareArea(x: Int) = x * x // area of a square

fun rectangleArea(x: Int, y: Int) = x * y // area of a rectangle

fun trapezoidArea(x: Int, y: Int, h: Int) = (x + y) / 2.0 * h // area of a trapezoid

fun main() { // tests
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  rectangleArea(3, 2) eq 6
  rectangleArea(3, 5) neq 9
  rectangleArea(3, 5) neq 25
  trapezoidArea(3, 3, 3) eq 9.0 // here it is important to use .0 because of divided by 2
  trapezoidArea(3, 2, 6) eq 15.0
  trapezoidArea(14, 69, 88) neq 15
}
