package extensionsForNullableTypesExercise1
import atomictest.eq

fun String?.orEmpty(): String = this ?: "" // if string is null we return "", in other case we return the string

fun main() {

  null.orEmpty() eq ""

  "abc".orEmpty() eq "abc"
}
