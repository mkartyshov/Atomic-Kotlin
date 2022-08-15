package sequencesExercise5

fun School.instructorsWithLargestClass(): Set<Instructor> {
  val maxStudents = lessons // let's take maxStudents from lessons
    .map { it.students.size } // map of students amount on every lessons
    .maxOrNull() // return maximum size or null
  
  return lessons.filter { it.students.size == maxStudents } // now let's filter the result
    .map { it.instructor } // instructors with that number of students 
    .toSet()
}
