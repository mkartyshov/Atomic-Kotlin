package interfacesExercise1
import atomictest.eq

interface Computer {
  fun calculateAnswer(): Int
}

class Cloud(n: Int) : Computer { // n indicating the number of Nodes in class
  val list: List<Node> = List(n) { Node(it) } // create a Node list
  override fun calculateAnswer(): Int { // count up to n and place each count as the result value of the Node you are currently creating
    return list.sumOf { it.calculateAnswer() }  // return sum of ints in list
  }
}

data class Node(
  private val result: Int
) : Computer {
  override fun calculateAnswer() = result // return the result
}

fun main() {
  Cloud(10).calculateAnswer() eq 45
}
