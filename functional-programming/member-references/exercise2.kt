package memberReferencesExercise2
import atomictest.eq

data class Student(
  val firstName: String,
  val lastName: String,
  val grade: Int
) {
  override fun toString(): String {
    return "$firstName $lastName ($grade)"
  }
}

fun List<Student>.sortByGradeAndThenByName(): List<Student> = sortedWith(
  compareByDescending(Student::grade).then(compareBy(Student::lastName).then(compareBy(Student::firstName)))) // First sort the students by their grade, then sort by lastName, then firstName

fun main() {
  val people = listOf(
    Student("Alice", "Johnson", 1),
    Student("Bob", "Smith", 2),
    Student("Charlie", "Smith", 2))

  people.sortByGradeAndThenByName() eq
    "[Bob Smith (2), Charlie Smith (2), " +
    "Alice Johnson (1)]"
}