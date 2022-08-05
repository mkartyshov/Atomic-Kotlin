package extensionsForNullableTypesExercise3
import atomictest.eq

data class Container(val contents: Any?)

fun Container?.empty(): Boolean = this == null || contents == null // return true if contents is null
// both functions are for nullable Containers
fun Container?.full(): Boolean = !empty() // if empty fun not true return true


fun main() {
  val container = Container(42)
  container.empty() eq false
  container.full() eq true

  val emptyContainer = Container(null)
  emptyContainer.empty() eq true
  emptyContainer.full() eq false
}
