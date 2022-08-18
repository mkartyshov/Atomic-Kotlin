package localFunctionsExercise3
import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var i: Int? = null
    fun add(value: Int) { // puts an Int element into the container
        i = value
    }
    fun remove(): Int? { // removes the element from the container
        val result = i
        i = null
        return result // return empty container
    }
    return Pair(::add, ::remove) // returns a Pair of functions to control the Int container
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}
