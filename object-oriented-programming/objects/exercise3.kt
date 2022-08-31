package objectsExercise3
import atomictest.*

interface AdventureGame {
  interface Environment
  interface Character
  val environment: Environment
  val characters: MutableList<Character>
  fun populate()
}

class Jungle : AdventureGame.Environment { // class Jungle is an Environment
  object Factory {
    fun create() = Jungle() // create Jungle
  }
}

class Monkey : AdventureGame.Character {
  object Factory {
    fun create() = Monkey() // create Monkey
  }
  override fun toString() = "Monkey"
}

class Snake : AdventureGame.Character {
  object Factory {
    fun create() = Snake() // create Snake
  }
  override fun toString() = "Snake"
}

object MonkeysVsSnakes : AdventureGame {
  override val environment =
    Jungle.Factory.create() // create Jungle environment
  override val characters =
    mutableListOf<AdventureGame.Character>()
  override fun populate() { // add population to environment
    characters.add(Monkey.Factory.create()) // add monkey
    characters.add(Snake.Factory.create()) // add snake
  }
}

fun main() {
  MonkeysVsSnakes.populate()
  MonkeysVsSnakes.characters eq
    "[Monkey, Snake]"
}
