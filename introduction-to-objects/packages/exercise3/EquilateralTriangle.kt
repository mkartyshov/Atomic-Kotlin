package pythagorean
import kotlin.math.sqrt // import sqrt function

class EquilateralTriangle(val side: Double) { // constructor class
    fun area() = sqrt(3.0) / 4 * side * side // member function, area of a triangle
}
