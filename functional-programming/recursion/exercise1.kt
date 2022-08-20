package recursionExercise1
import atomictest.*

tailrec fun simulation(group: String, level: Int) {
  trace("Simulation: $group Reality: $level") // trace obj
  if (level > 0) simulation(group, level - 1) // call function with level - 1, till level > 0
}

fun main() {
  simulation("FOO", 10)
  trace eq """
    Simulation: FOO Reality: 10
    Simulation: FOO Reality: 9
    Simulation: FOO Reality: 8
    Simulation: FOO Reality: 7
    Simulation: FOO Reality: 6
    Simulation: FOO Reality: 5
    Simulation: FOO Reality: 4
    Simulation: FOO Reality: 3
    Simulation: FOO Reality: 2
    Simulation: FOO Reality: 1
    Simulation: FOO Reality: 0
  """
}