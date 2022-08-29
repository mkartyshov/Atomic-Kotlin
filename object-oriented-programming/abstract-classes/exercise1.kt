package abstractClassesExercise1

import atomictest.trace

abstract class Shape { // abstract class Shape with to abstract methods, return type Unit
    abstract fun draw()
    abstract fun erase() 
}
// override abstract methods to call trace():
class Circle : Shape() { 
    override fun draw() = trace("Draw Circle") 
    override fun erase() = trace("Erase Circle")
}

class Square : Shape() {
    override fun draw() = trace("Draw Square")
    override fun erase() = trace("Erase Square")
}

class Triangle : Shape() {
    override fun draw() = trace("Draw Triangle")
    override fun erase() = trace("Erase Triangle")
}

fun main() {
    val shapes = listOf(
        Circle(),
        Square(),
        Triangle(),
    )
    shapes.forEach { it.draw() } // draw() for each object
    shapes.forEach { it.erase() } // erase() for each object
    trace eq """
    Draw Circle
    Draw Square
    Draw Triangle
    Erase Circle
    Erase Square
    Erase Triangle
  """
}
