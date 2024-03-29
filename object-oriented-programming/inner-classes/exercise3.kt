package innerClassesExercise3
import atomictest.*

interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}

class Container<T>(iterable: Iterable<T>) : Iterable<T> {
  private val items = iterable.toMutableList()
  fun add(x: T) = items.add(x)
  fun selector() = object : Selector<T> { // returns an object of an anonymous inner class
    private var i = 0
    override fun end() = i == items.size // tells whether you're at the end of the items List
    override fun current() = items[i] // returns the current element pointed to by the Selector
    override fun next() { // moves to the next element in the List
      if (i < items.size) i++
    }
  }
// returns an instance of an anonymous inner class that inherits from Iterator<T>:
  override fun iterator() = object : Iterator<T> { 
    private var i = 0
    override fun hasNext() = i < items.size
    override fun next(): T = items[i++]
  }
}

fun <T> traceAll(select: Selector<T>) {
  while (!select.end()) {
    trace("${select.current()}")
    select.next()
  }
}
// standalone function <T> traceAll2(ib: Iterable<T>):
fun <T> traceAll2(ib: Iterable<T>) {
  val iter = ib.iterator()
  while (iter.hasNext())
    trace("${iter.next()}") // produces the same behavior as traceAll()
}

fun main() {
  traceAll(Container(0..9).selector())
  trace eq "0 1 2 3 4 5 6 7 8 9"
  traceAll2(Container(0..9))
  trace eq "0 1 2 3 4 5 6 7 8 9"
  traceAll(Container(List(10){ it * it })
    .selector())
  trace eq "0 1 4 9 16 25 36 49 64 81"
  traceAll2(Container(List(10){ it * it }))
  trace eq "0 1 4 9 16 25 36 49 64 81"
}
