package extensionPropertiesExercise3
import atomictest.eq

class Rectangle (val width: Int, val height: Int) // class Rectangle

val Rectangle.isSquare: Boolean
    get() = width == height // check if width and height of rectangle are equal

fun main() {
  val rectangle = Rectangle(1, 2)
  rectangle.isSquare eq false

  val square = Rectangle(3, 3)
  square.isSquare eq true
}
