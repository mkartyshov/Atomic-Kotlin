package propertyAccessorsExercise2

class Accessible {
    var mutable: String = ""
    get() { // we get the mutable string
        println("mutable:get")
        return field
    }
    set(value) { // we change the mutable string
        println("mutable:set")
        field = value
    }
    val readOnly: String
        get() { // we get the readonly string
            println("readOnly:get")
            return mutable // we return the mutable, but because it is a val now, it will return the get() of mutable
        }
}

fun main() {
  val accessible = Accessible()
  accessible.mutable
  accessible.readOnly
}
/* output:
mutable:set // we get it after the set(value) of mutable
readOnly:get // the first line from get() readOnly
mutable:get // return the mutable
 */
