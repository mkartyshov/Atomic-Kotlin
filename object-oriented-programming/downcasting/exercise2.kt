package downcastingExercise2
import downcasting.*
import atomictest.eq

// First find all Dog objects, then map each of the resulting objects onto bark() and test the result:

fun main() {
    group.filterIsInstance<Dog>()
        .map(Dog::bark) eq "[Yip!, Yip!]"
    group.filterIsInstance(Dog::class.java) // doing the same by using Dog::class.java
        .map(Dog::bark) eq "[Yip!, Yip!]"
}
