package creatingClassesExercise2

class Giraffe { // class to display the address of the object
    fun displayID() = println(toString().substringAfter('@')) // extracting the address from the default object representation
}

fun main() {
  val giraffe1 = Giraffe() // creating some giraffes (objects)
  val giraffe2 = Giraffe()
  val giraffe3 = Giraffe()
  giraffe1.displayID() // displaying their address
  giraffe2.displayID()
  giraffe3.displayID()
}
