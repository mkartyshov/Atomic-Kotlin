package overloadingExercise2

class Dog {
    fun bark(n: Int, say: String = "woof") { // now the function has default value for say argument
        repeat(n) {
            println(say) // we repeat the say line for n times
        }
    }
}

fun main() {
  val dog = Dog()
  dog.bark(3)
  dog.bark(2, "wow")
}
/* output:
woof
woof
woof
wow
wow
 */
