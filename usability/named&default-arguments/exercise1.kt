package namedAndDefaultArgumentsExercise1

class Rectangle(val side1: Double = 1.0, val side2: Double = 2.0, val color: String = "yellow") {
  override fun toString() = "$color rectangle $side1 x $side2"
}

fun main() {
  Rectangle()
  
  Rectangle(1.0, 2.0, "yellow") // No names for arguments
  
  Rectangle(side1 = 1.0, side2 = 2.0) // With names for arguments
  Rectangle(color = "yellow")
  
  Rectangle(1.0, side2 = 2.0, "yellow") // Mixed
}
