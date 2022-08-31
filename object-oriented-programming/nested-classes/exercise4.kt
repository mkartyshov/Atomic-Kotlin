package nestedClassesExercise4

import atomictest.eq
import nestedClassesExercise4.Seat.*

class Ticket(private var seat: Seat = Coach()) { // simple holder for a Seat object
    fun upgrade(): Seat {
        seat = seat.upgrade()
        return seat
    }
// upgrade() and meal() forward their actions to the Seat object
    fun meal() = seat.meal()
    override fun toString() = "$seat"
}

abstract class Seat { // change Seat from an enumeration to a non-nested abstract class
    abstract fun upgrade(): Seat //  Seat contains abstract member functions for upgrade()
    abstract fun meal(): String // and meal()
    override fun toString() = "${this::class.simpleName}" // toString() for Seat that produces the simpleName of the specific subclass
    class Coach : Seat() {
        override fun upgrade() = Premium()
        override fun meal() = "Bag Meal"
    }

    class Premium : Seat() {
        override fun upgrade() = Business()
        override fun meal() = "Bag Meal + Cookie"
    }

    class Business : Seat() {
        override fun upgrade() = First()
        override fun meal() = "Hot Meal"
    }

    class First : Seat() {
        override fun upgrade() = First()
        override fun meal() = "Private Chef"
    }
}

fun main() {
    val tickets = listOf(
        Ticket(),
        Ticket(Premium()),
        Ticket(Business()),
        Ticket(First())
    )
    tickets.map(Ticket::meal) eq
            "[Bag Meal, Bag Meal + Cookie, " +
            "Hot Meal, Private Chef]"
    tickets.map(Ticket::upgrade) eq
            "[Premium, Business, First, First]"
    tickets eq
            "[Premium, Business, First, First]"
    tickets.map(Ticket::meal) eq
            "[Bag Meal + Cookie, Hot Meal, " +
            "Private Chef, Private Chef]"
}
