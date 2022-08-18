package localFunctionsExercise2
import atomictest.eq

fun createCounter(): Pair<() -> Unit, () -> Int> {
  var counter = 0

  fun inc() { // increases the counter value by one
    counter++
  }

  fun value(): Int { // returns the value of counter
    return counter
  }

  return Pair(::inc, ::value) // return a pair of function references to these local functions
}

fun main() {
  val (inc, value) = createCounter()
  repeat(10) {
    inc()
  }
  value() eq 10
}
