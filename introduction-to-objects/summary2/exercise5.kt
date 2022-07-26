package summaryIIExercise5

fun va1(vararg ints: Int) {
    println("va1:")
    for (i in ints) {
        println(i) // print ints from va1
    }
}

fun va2(vararg ints: Int) {
    println("va2:")
    va1(*ints) // we are using ints from va2 for va2
}

fun main() {

    va1(1, 2, 3)
    va2(4, 5, 6)

}
/* output:
va1:
1
2
3
va2:
va1:
4
5
6
 */
