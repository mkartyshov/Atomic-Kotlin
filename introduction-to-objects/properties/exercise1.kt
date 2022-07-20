package propertiesExercise1

class X { // class X contains three properties
    val a = 3
    val b = 42
    var c: Int = 0 // int, because 0 is not unit
    fun add(): Int {
        c = a + b
        return c
    }
}

fun main() { // testing the result
  var result = X()
    result.add()
    println(result)
}
