package propertiesExercise2

// working with movements of a Robot object

class Robot {
  var x: Int = 0 // starting point X
  var y: Int = 0 // starting point Y

  fun right(steps: Int) { // robot goes right => x+1
    x += steps
  }

  fun left(steps: Int) { // robot goes left => x-1
    x -= steps
  }

  fun down(steps: Int) { // robot goes down => y+1
    y += steps
  }

  fun up(steps: Int) { // robot goes up => y-1
    y -= steps
  }

  fun getLocation(): String = "($x, $y)" // return the location of robot
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.right(1)
  println(robot.getLocation())
  robot.down(2)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(1, 0)
(1, 2)
*/
