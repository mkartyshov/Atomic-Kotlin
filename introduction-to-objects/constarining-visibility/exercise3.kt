package constrainingVisibilityExercise3

class Robot(
    private val fieldSize: Int,
    private var x: Int,
    private var y: Int
) {
    private fun crossBoundary(coordinate: Int): Int {
        val inBounds = coordinate % fieldSize
        return if (inBounds < 0) {
            fieldSize + inBounds
        } else {
            inBounds
        }
    }

    fun checkForNegativeSteps(steps: Int): Boolean { // Now let's check if robot tries to move forward
        if (steps <= 0) { // if the amount of steps is less or equal zero
            println("steps argument must be positive, is $steps") // then we print this error
            return true // mark it as true
        }
        return false // mark it as false, if steps > 0
    }

    fun right(steps: Int) {
        if (checkForNegativeSteps(steps)) return // checking for the negative steps, if the return is true, then simply return
        x += steps
        x = crossBoundary(x)
    }

    fun left(steps: Int) {
        if (checkForNegativeSteps(steps)) return
        x -= steps
        x = crossBoundary(x)
    }

    fun down(steps: Int) {
        if (checkForNegativeSteps(steps)) return
        y += steps
        y = crossBoundary(y)
    }

    fun up(steps: Int) {
        if (checkForNegativeSteps(steps)) return
        y -= steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x, $y)"

    override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
    val robot = Robot(10, 1, 1)
    robot.right(-1)
}
/* Output:
steps argument must be positive, is -1
*/
