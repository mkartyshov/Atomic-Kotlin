package sealedClassesExercise2
import sealedClassesExercise1.*
import atomictest.*

/*
Use sealedSubclasses to iterate through the classes in the previous exercise. 
For each class, trace() its simpleName.
 */

fun main() {
  Transport::class.sealedSubclasses
      .map { it.simpleName }
      .forEach { trace(it) }
   trace eq """
    Train
    Bus
    Tram
    Plane
  """
}
