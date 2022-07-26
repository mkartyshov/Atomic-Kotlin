package summaryIIExercise1

import atomictest.eq

class Boring { // really Boring class with functions that return some values
    fun a() = 1.618
    fun b() = "ratio"
    fun c() = 11
}

fun main() { // boring testing for Boring class
    val boring = Boring()
    boring.a() eq 1.618
    boring.b() eq "ratio"
    boring.c() eq 11
}
