package upcastingExercise3
import atomictest.trace

interface Fighter {
  fun fight(): String
}

interface Swimmer {
  fun swim(): String
}

interface Flyer {
  fun fly(): String
}

open class ActionCharacter {
  fun fight(): String = "ActionCharacter fight"
}

class Hero : ActionCharacter(), Flyer, Swimmer, Fighter { // class Hero that combines ActionCharacter, Fighter, Swimmer and Flyer
  override fun swim(): String = "Hero swim" // swim() return "hero swim"
  override fun fly(): String = "Hero fly" // fly() return "hero fly"
}
// each function calls the member function available to its parameter and traces its result:
fun tryFight(x: Fighter) {
  trace(x.fight())
}

fun trySwim(x: Swimmer) {
  trace(x.swim())
}

fun tryFly(x: Flyer) {
  trace(x.fly())
}

fun doAction(x: ActionCharacter) {
  trace(x.fight())
}

fun main() {
  val h = Hero()
  tryFight(h) // Treat it as a Fight
  trySwim(h) // Treat it as a Swim
  tryFly(h) // Treat it as a Fly
  doAction(h) // Treat it as an ActionCharacter
  trace eq """
    ActionCharacter fight
    Hero swim
    Hero fly
    ActionCharacter fight
  """
}
