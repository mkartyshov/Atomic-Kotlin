package namedAndDefaultArgumentsExercise3
import atomictest.eq

fun joinComments(s: String): String =
  s.trimMargin("// ").lines().joinToString("; ") // displaying String in a more fancy way

fun main() {
  val s = """
        // First
        // Second
        // Third
        """
  joinComments(s) eq "First; Second; Third"
}
