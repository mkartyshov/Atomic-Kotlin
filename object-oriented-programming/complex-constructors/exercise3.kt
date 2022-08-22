package complexConstructorsExercise3
import atomictest.eq
// adding the Strings "one", "two" and "three" to the initOrder property in three different init blocks
class MultipleInit {
  val initOrder = mutableListOf<String>()
  init {
    initOrder.add("one")
  }
  init {
    initOrder.add("two")
  }
  init {
    initOrder.add("three")
  }
}

fun main() {
  MultipleInit().initOrder eq "[one, two, three]"
}
