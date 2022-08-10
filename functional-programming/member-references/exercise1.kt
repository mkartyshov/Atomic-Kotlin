package memberReferencesExercise1
import atomictest.eq
import memberReferencesExercise1.Habitat.*

data class Pet(
  var name: String,
  val habitat: Habitat
) {
  override fun toString() = name
}

enum class Habitat {
  LAND, WATER, AMPHIBIOUS;
  fun livesIn(pet: Pet) = pet.habitat == this
}

fun List<Pet>.liveOnLand(): List<Pet> =
  filter(LAND::livesIn) // filter pets living on land

fun List<Pet>.liveInWater(): List<Pet> =
  filter(WATER::livesIn) // filter pets living in water

fun List<Pet>.areAmphibious(): List<Pet> =
  filter(AMPHIBIOUS::livesIn) // filter amphibious pets

fun List<Pet>.partitionAmphibious(): Pair<List<Pet>, List<Pet>> =
  partition(AMPHIBIOUS::livesIn) // create a pair with amphibious and other pets

fun main() {
  val pets = listOf(
    Pet("Dog", LAND),
    Pet("Cat", LAND),
    Pet("Goldfish", WATER),
    Pet("Turtle", AMPHIBIOUS),
    Pet("Frog", AMPHIBIOUS)
  )
  pets.liveOnLand() eq "[Dog, Cat]"
  pets.liveInWater() eq "[Goldfish]"
  pets.areAmphibious() eq "[Turtle, Frog]"
  pets.partitionAmphibious() eq
    "([Turtle, Frog], [Dog, Cat, Goldfish])"
}
