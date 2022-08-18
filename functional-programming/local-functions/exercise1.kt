package localFunctionsExercise1
import atomictest.eq

// function f() that returns the result of its local function g() which in turn returns the result of it's local function h()

fun f(): Int {
    fun g(): Int {
        fun h() = 47
        return h()
    }
    return g()
}

fun main() {
    f() eq 47
}
