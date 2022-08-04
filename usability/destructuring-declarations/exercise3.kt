package destructuringDeclarationsExercise3

data class Person( // data class that stores info about pesron
  val name: String,
  val surname: String,
  val age: Int
)

fun displayPersonInfo(person: Person) { // display info about person; we don't show surname
  val (name, age) = person
  println("Name: $name")
  println("Age: $age")
}

fun main() {
// val person = Person("Alice",  30) -- this one doesn't work, cause it has no age
  val person = Person("Alice", "Johnson", 30) // this one works
  displayPersonInfo(person)
}
