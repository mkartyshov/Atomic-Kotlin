package propertyAccessorsExercise4

import atomictest.eq

class AccessCounter {
    private var _accesses = 0 // by default _accesses is zero

    val accesses: Int
        get() = ++_accesses // every time we use accesses, we make it +1
}

fun main() {
    val counter = AccessCounter()
    counter.accesses eq 1
    counter.accesses eq 2
    counter.accesses eq 3

    val counter2 = AccessCounter()
    repeat(10) {
        counter2.accesses
    }
    counter2.accesses eq 11
}
