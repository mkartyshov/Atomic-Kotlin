package abstractClassesExercise3
import atomictest.trace

enum class Note {
  A, B, C, D, E, F, G
}

open class Instrument(val name: String, val action: String) { // Instrument is an open class with two arguments
  fun play(n: Note): String = "$name $action $n" // and a function
}
// next subclasses are inherited from Instrument; each with its own arguments:
class Wind : Instrument(name = "Wind", action = "blow")

class Percussion : Instrument(name = "Percussion", action = "strike")

class Stringed : Instrument(name = "Stringed", action = "pluck")

fun tune(i: Instrument) = i.play(Note.C)

fun main() {
  val orchestra = listOf(
    Wind(),
    Percussion(),
    Stringed()
  )
  for (instrument in orchestra) {
    trace(tune(instrument))
  }
  trace eq """
    Wind blow C
    Percussion strike C
    Stringed pluck C
  """
}
