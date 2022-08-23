package inheritanceExercise3
import atomictest.eq
// Task: Give each class an init clause that appends its class name to initOrder:
open class Game {
    val initOrder = mutableListOf<String>()
    init {
        initOrder += "Game"
    }
}

open class BoardGame: Game() {
    init {
        initOrder += "BoardGame"
    }
}

class Chess: BoardGame() {
    init {
        initOrder += "Chess"
    }
}

fun main() {
    Chess().initOrder eq "[Game, BoardGame, Chess]"
}
