package summaryIIExercise2
import atomictest.eq
import summaryIIExercise1.Boring

class Boring2(val a: Double, val b: String, val c: Int) { // another boring class Boring2 to return parameters from the constructor
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val boring2 = Boring2(a = 1.28, b = "Hello", c = 12) // testing the Boring2 class
  boring2.a eq 1.28
  boring2.b eq "Hello"
  boring2.c eq 12
}
