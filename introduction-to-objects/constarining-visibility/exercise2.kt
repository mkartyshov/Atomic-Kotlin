package constrainingVisibilityExercise2

// playing with private properties and members. This code won't work.

class Robot(
  private val fieldSize: Int, // now we cannot access the properties outside the Robot class
  private var x: Int,
  private var y: Int
) {
  private fun crossBoundary(coordinate: Int): Int { // a private member function
    val inBounds = coordinate % fieldSize
    return if (inBounds < 0) {
      fieldSize + inBounds
    } else {
      inBounds
    }
  }

  fun right(steps: Int) {
    x += steps
    x = crossBoundary(x)
  }

  fun left(steps: Int) {
    x -= steps
    x = crossBoundary(x)
  }

  fun down(steps: Int) {
    y += steps
    y = crossBoundary(y)
  }

  fun up(steps: Int) {
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"

  override fun toString() = "Robot(x=$x, y=$y)"
}

fun main() {
  val robot = Robot(10, 1, 1)
  println(robot.x) // Kotlin: Cannot access 'x': it is private in 'Robot'
}
