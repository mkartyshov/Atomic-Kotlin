package enumerationsExercise3
import atomictest.eq
import enumerationsExercise3.Result.*
import enumerationsExercise3.Rochambeau.*

enum class Rochambeau {
  ROCK, PAPER, SCISSORS
}

enum class Result {
  DRAW, FIRST_WINS, SECOND_WINS
}

fun winner(first: Rochambeau, second: Rochambeau): Result {
  if (first == second) return DRAW // if first and second equal => draw
  val winning = mapOf( // map of winning combinations
    ROCK to SCISSORS,
    PAPER to ROCK,
    SCISSORS to PAPER)
  return if (winning[first] == second) { // how does it work?
    FIRST_WINS // if the first guy has winning combination => display it
  } else {
    SECOND_WINS // in other case => second wins
  }
}

fun main() {
  winner(ROCK, SCISSORS) eq FIRST_WINS
  winner(SCISSORS, ROCK) eq SECOND_WINS
  winner(PAPER, PAPER) eq DRAW
}
