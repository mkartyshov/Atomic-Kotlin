package summaryIIExercise3

import atomictest.*

class FixedSizeHolder(private val max: Int) { // we create a class with a constructor that sets the maximum number on objects
    private val holder = mutableListOf<Any>() // holder is a list of Any objects

    val size: Int
        get() = holder.size // we get the size of our holder list

    val full: Boolean
        get() = max == holder.size // if holder is full, then it is true

    fun add(any: Any) {
        if (full) throw IllegalStateException("The container is full") // if full is true, then we throw an exception
        holder += any // otherwise we add an Any object
    }
}

fun main() {
    val holder = FixedSizeHolder(2)
    holder.add("What is the answer?")
    holder.add(42)
    holder.full eq true
    holder.size eq 2
    capture {
        holder.add("!!!")
    } eq "IllegalStateException: The container is full"
}
