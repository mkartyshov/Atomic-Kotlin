package classDelegationExercise1
import atomictest.eq
/*
Modify ModelingMI.kt by adding fun resize(scale: Int): Int to Rectangle, which just returns scale. 
Add a fun rightClicked(): Boolean to MouseManager. Call the new functions in main() and 
verify that Button needs no modifications to support the new interfaces. 
*/
interface Rectangle {
  fun paint(): String
  fun resize(scale: Int): Int
}

class ButtonImage(
  val width: Int,
  val height: Int
) : Rectangle {
  override fun paint() =
    "painting ButtonImage($width, $height)"
  override fun resize(scale: Int) = scale
}

interface MouseManager {
  fun clicked(): Boolean
  fun hovering(): Boolean
  fun rightClicked(): Boolean
}

class UserInput : MouseManager {
  override fun clicked() = true
  override fun hovering() = true
  override fun rightClicked() = true
}

class Button(
  val width: Int,
  val height: Int,
  val image: Rectangle =
    ButtonImage(width, height),
  val input: MouseManager = UserInput()
) : Rectangle by image, MouseManager by input

fun main() {
  val button = Button(10, 5)
  button.paint() eq
          "painting ButtonImage(10, 5)"
  button.clicked() eq true
  button.hovering() eq true
  button.rightClicked() eq true
  button.resize(4) eq 4
}
