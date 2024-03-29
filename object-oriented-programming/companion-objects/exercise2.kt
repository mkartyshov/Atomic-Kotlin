package companionObjectsExercise2
import atomictest.*

interface BoardGame {
  fun move(): Boolean
  companion object {
    fun createBoard() {
      trace("BoardGame.createBoard()")
    }
  }
}

interface GameFactory {
  fun create(): BoardGame
}
// Checkers and Chess, which inherit BoardGame:
class Checkers private constructor() : BoardGame {
  companion object Factory : GameFactory {
    private const val max = 3
    init {
      BoardGame.createBoard()
    }
    override fun create() = Checkers()
  }
  private var moves = 0
  override fun move(): Boolean {
    trace("Checkers move $moves")
    return ++moves != max
  }
}

class Chess private constructor() : BoardGame {
  companion object Factory : GameFactory {
    private const val max = 4
    init {
        BoardGame.createBoard()
    }
    override fun create() = Chess()
  }
  private var moves = 0
  override fun move(): Boolean {
    trace("Chess move $moves")
    return ++moves != max
  }
}

fun playGame(factory: GameFactory) {
  val s = factory.create()
  while (s.move())
    ;
}

fun main() {
  playGame(Checkers.Factory)
  playGame(Chess.Factory)
  trace eq """
  BoardGame.createBoard()
  Checkers move 0
  Checkers move 1
  Checkers move 2
  BoardGame.createBoard()
  Chess move 0
  Chess move 1
  Chess move 2
  Chess move 3
  """
}
