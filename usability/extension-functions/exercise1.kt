package extensionFunctionsExercise1
import atomictest.eq

fun String.wrapInTag(tagName: String): String = "<$tagName>$this</$tagName>" // implement an extension function that wraps the String in XML tag

fun main() {
  "cat".wrapInTag("animal") eq "<animal>cat</animal>"
}
