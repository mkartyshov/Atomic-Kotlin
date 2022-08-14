package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double = // taking average from rating
  lessons
    .filter { it.instructor == instructor }
    .flatMap { it.rating.values.asSequence() }
    .average()
