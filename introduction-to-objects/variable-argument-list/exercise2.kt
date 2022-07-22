package variableArgumentListsExercise2

fun printArgs(s: String, vararg i: Int) {
    println("$s${i.toList()}") // convert vararg to string for a proper representation
}

fun main() {
    printArgs("Numbers: ", 1, 2, 3)
}
/* output:
Numbers: [1, 2, 3]
 */
