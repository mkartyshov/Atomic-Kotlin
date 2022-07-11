package stringTemplatesExercise3

// writing a function show() with four parameters; the function must display parameters in a specific way

fun show(i: Int, s: String, c: Char, d: Double) {
    println("i: $i")
    println("s: \"$s\"")
    println("c: '$c'")
    println("d: $d")
}

fun main() {
show(1, "abc", 'd', 2.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/
