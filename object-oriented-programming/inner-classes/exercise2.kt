package innerClassesExercise2
import atomictest.eq
// a class Box(contains: String, label: String),
// with inner classes Contents holding contains as a val, 
// and Destination holding label as a val
class Box(contains: String, label: String) {
  inner class Contents(val contains: String)
  inner class Destination(val label: String)
  // two private references: contents and destination, 
  // initialized to instances of their associated inner classes:
  private val contents = Contents(contains)
  private val destination = Destination(label)
  private val x = object : Any() { // private val x that is initialized to an object of an anonymous inner class
    fun f() = "Any-based" // function returns "Any-based"
  }
  fun manifest() = // String containing the properties contains and label and the output of f():
    "${contents.contains}:" + " ${destination.label} ${x.f()}" 
}

fun main() {
  Box("Computer", "Tasmania").manifest() eq
    "Computer: Tasmania Any-based"
}
