package constrainingVisibilityExercise1

class Alien(val name: String, val species: String, private var planet: String) { // setting an Alien class with a constructor
    fun movePlanet(destination: String) { // function to change alien's planet
        planet = destination // now, if we want to change alien's planet, we can just use movePlanet
    }
    override fun toString() = "Alien $name, $species: $planet" // convert the result to string
}

fun main() {
  val alien1 = Alien("Athricia", "Cat Person", "PurgePlanet") // alien's parameters
  println(alien1) // alien with original planet
  alien1.movePlanet("Earth C-137") // changing the destination of an alien
  println(alien1) // alien with destination planet

  val alien2 = Alien("Dale", "Giant", "Gearworld")
  println(alien2)
  alien2.movePlanet("Parblesnops") // changing the destination of an alien
  println(alien2)
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/
