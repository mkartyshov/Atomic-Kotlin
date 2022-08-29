package abstractClassesExercise2
import atomictest.eq
// converted Movable and Sleepable to interfaces, so class Sofa could inherit both
interface Movable {
  fun move() = "move"
}

interface Sleepable {
  fun sleepOn() = "sleep"
}

class Sofa: Movable, Sleepable

fun main() {
  val sofa = Sofa()
  sofa.move() eq "move"
  sofa.sleepOn() eq "sleep"
}
