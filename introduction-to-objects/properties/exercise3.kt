package propertiesExercise3

class Robot {
  var x = 0
  var y = 0
  val fieldSize = 100 // determine a field size

  fun crossBoundary(location: Int): Int { // creating a function to cross boundaries
    val inside = location % fieldSize // formula to detect the right position
    return if (inside < 0) {
      fieldSize + inside // if the right position is less than 0, then we subtract inside from fieldSize
    } else {
      inside // if the right position is bigger than 0, then we just leave the inside
    }
  }

  fun right(steps: Int) {
    x += steps
    x = crossBoundary(x) // answer goes through the crossBoundary function
  }

  fun left(steps: Int) {
    x -= steps
    x = crossBoundary(x) // answer goes through the crossBoundary function
  }

  fun down(steps: Int) {
    y += steps
    y = crossBoundary(y) // answer goes through the crossBoundary function
  }

  fun up(steps: Int) {
    y -= steps
    y = crossBoundary(y) // answer goes through the crossBoundary function
  }

  fun getLocation(): String = "($x, $y)" // display the location of the robot
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.up(1)
  println(robot.getLocation())
  robot.left(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/
