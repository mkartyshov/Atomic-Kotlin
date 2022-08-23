package inheritanceExercise2
import inheritanceExercise1.Detergent
import atomictest.eq

class Disinfectant: Detergent() { // inherited class from previous exercise
    fun sterilize() { // add function name to list
        ops += "sterilize"
    }
}

fun main() {

  val disinfectant = Disinfectant()
  disinfectant.dilute()
  disinfectant.apply()
  disinfectant.scrub()
  disinfectant.sterilize()
  disinfectant.ops eq
    listOf("dilute", "apply", "scrub", "sterilize")

}
