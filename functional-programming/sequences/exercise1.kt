package sequencesExercise1

fun School.commonLessons( //  function to find all the lessons that a student is taking with a particular instructor
  instructor: Instructor,
  student: Student
): Sequence<Lesson> {
  return lessons.filter { 
    instructor == it.instructor && student in it.students // instructor is in lesson && student is in lesson
  }
