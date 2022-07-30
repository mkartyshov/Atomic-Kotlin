package dataClassesExercise1

data class AirlineTicket( // creating a data class with information about ticket
    val firstName: String,
    val lastName: String,
    val ticket: Int,
    val origin: String,
    val destination: String
)

fun main() {
  val ticket = AirlineTicket("Bruce", "Eckel",
    123456, "DEN", "HND")
  println(ticket)
}
/* output:
AirlineTicket(firstName=Bruce, lastName=Eckel, ticket=123456, origin=DEN, destination=HND)
*/
