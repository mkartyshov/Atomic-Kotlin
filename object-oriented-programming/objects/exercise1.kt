package objectsExercise1
import atomictest.*

private fun f() = trace("f() $p")
private val p = "p"
// a file-level private fun f() and private val p inside object Space and again in private object Space2
object Space {
  fun f() = trace("f() $p")
  private val p = "p"
}

private object Space2 {
  fun f() = trace("f() $p")
  private val p = "p"
}

fun main() {
  f()
  Space.f()
  Space2.f()
  trace eq """
    f() p
    Space.f() Space.p
    Space2.f() Space2.p
  """
}
