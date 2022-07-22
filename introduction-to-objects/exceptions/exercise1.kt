package exceptionsExercise1

fun main() {
  println("Can't be converted to double: 1,2") // this val we can't convert to Double

  val a = "12".toDouble()
  val b = "1.2".toDouble()
  // val c = "1,2".toDouble()
  val d = "1.2e0".toDouble()
  val e = "1.2e1".toDouble()
  val f = "1.2e2".toDouble()
  val g = "1.2e3".toDouble()
  val h = "1.2e10".toDouble()
  val i = "12.3e10".toDouble()
  val j = "1.2e-1".toDouble()
  val k = "1.2e-10".toDouble()
}
