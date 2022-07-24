package mapsExercise2

import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
    override fun toString(): String {
        return "Hamster('$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters =
        mutableListOf<Hamster>()

    fun put(hamster: Hamster): Boolean =
        if (hamsters.size == maxCapacity)
            false
        else {
            hamsters += hamster
            true
        }

    fun get(name: String): Hamster {
        for (hamster in hamsters) { // for every hamster (class) in a hamsters list (cage class)
            if (hamster.name == name) { // if hamster.name is listed in hamsters list
                return hamster // then we return the hamster from the list as in class Hamster (ln.9)
            }
        }
      throw NoSuchElementException("No hamster called $name") // if there's no hamster with that name, then exception
    }
}

fun main() {
    val cage = Cage(2)
    cage.put(Hamster("Alice")) eq true
    cage.get("Alice") eq "Hamster('Alice')"
    capture {
        cage.get("Bob")
    } eq "NoSuchElementException: " +
            "No hamster called Bob"
}
