package sequencesExercise4

fun School.favoriteInstructor(student: Student): Instructor? = // finds an instructor whose classes student takes more often
  lessons
    .filter { student in it.students } // filter student from lessons
    .groupBy { it.instructor } // group by student's instructor
    .maxByOrNull { (_, lessons) -> lessons.size } // the instructor whose lessons has bigger size will be first
    ?.key // return null if student has no classes
