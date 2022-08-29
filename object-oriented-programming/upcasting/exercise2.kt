package upcastingExercise2
import atomictest.eq

interface Apple { // interface Apple containing an abstract member function
  fun consume(): String
}
// override consume function in inherited classes:
class GrannySmith : Apple {
  override fun consume(): String = "chomp GrannySmith"
}

class Gala : Apple {
  override fun consume(): String = "bite Gala"
}

class Fuji : Apple {
  override fun consume(): String = "press Fuji"
}

class Braeburn : Apple {
  override fun consume(): String = "peel Braeburn"
}

fun main() {
  val apples = listOf(
    GrannySmith(),
    Gala(),
    Fuji(),
    Braeburn()
  )
  apples.map { TODO() } eq
    "[chomp GrannySmith, " +
    "bite Gala, press Fuji, peel Braeburn]"
}
