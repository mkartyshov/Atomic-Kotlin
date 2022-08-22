package complexConstructorsExercise1
import atomictest.eq

class Alien(name: String) { //  Alien class with name: String as a constructor parameter
    val myName: String
    init {
        myName = name // assign name to the property myName inside the init section
    }
}

fun main() {
  val alien = Alien("Pencilvester")
  alien.myName eq "Pencilvester"
}
