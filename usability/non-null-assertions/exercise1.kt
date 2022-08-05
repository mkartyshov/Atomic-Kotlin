package nonNullAssertionsExercise1
import atomictest.*

class Rocket {
    fun ignition() = "Liftoff!" // function returns "Liftoff!"
}

fun launch(rocket: Rocket?) = rocket!!.ignition() // nullable Rocket parameter; throws exception if null passed

fun main() {
  val rocket = Rocket()
  launch(rocket) eq "Liftoff!"
  capture {
    launch(null)
  } eq "NullPointerException"
}
