package overloadingExercise1

class Dog {
    fun bark(n: Int) {
        bark(n, "woof") // we call the next bark function
    }
    fun bark(n: Int, say: String) {
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
