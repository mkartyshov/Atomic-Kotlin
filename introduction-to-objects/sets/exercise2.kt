package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  val x = mutableSetOf<Int>()
  var y = 0
  do {
    y++ // count the numbers
    x += Random.nextInt(25) + 1 // random number from 1 to 25
  } while (x.size < 25) // we will return y, until size of x set will be <25
  return y
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average()) // 95.681
}
