package compositionExercise3
import atomictest.*

class Queue<E> {
  private val arrayDeque = ArrayDeque<E>() // let's use arrayDeque instead of mutableList
  fun put(e: E) = arrayDeque.add(e) // add last to array
  fun poll(): E = arrayDeque.removeFirst() // remove first from array
}

fun main() {
  val queue = Queue<String>()
  queue.put("a")
  queue.put("b")
  queue.put("c")
  queue.put("d")
  queue.poll() eq "a"
  queue.poll() eq "b"
}
