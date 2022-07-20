package creatingClassesExercise3

class Robot { // create Robot class that displays movement of the robot
    fun right(steps: Int) = println("Right $steps steps")
    fun left(steps: Int) = println("Left $steps steps")
    fun down(steps: Int) = println("Down $steps steps")
    fun up(steps: Int) = println("Up $steps steps")
}

fun main() {
  val robot = Robot()
  robot.up(11) // robot makes 11 steps up
}
/* Output:
Up 11 steps
*/
