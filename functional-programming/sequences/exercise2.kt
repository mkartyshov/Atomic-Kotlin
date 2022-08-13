package sequencesExercise2

fun School.studentInstructors( // find all instructors that have classes with this student
  student: Student
): Set<Instructor> {
  return lessons.filter {  // filter lessons
    student in it.students // find student in a set of students
  }.mapTo(mutableSetOf()) { it.instructor } // create a set of instructor of one student
}

fun School.studentsOf( //  find all students that attend classes with this instructor
  instructor: Instructor
): Set<Student> {
  return lessons.filter { // filter lessons
    instructor == it.instructor // find instructor who is an instructor from the lesson
  }.flatMapTo(mutableSetOf()) { it.students.asSequence() } // create a set of students of this instructor, listed as sequence
}
