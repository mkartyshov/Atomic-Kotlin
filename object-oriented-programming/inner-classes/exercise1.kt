package innerClassesExercise1
import atomictest.eq

fun interface Pet {
  fun speak(): String
}

object CreatePet {
  fun home() = " home!"
  fun dog(): Pet {
    val say = "Bark"
    class Dog : Pet {
      override fun speak() = say + home()
    }
    return Dog()
  }
  fun cat(): Pet {
    val emit = "Meow"
    return object : Pet {
      override fun speak() = emit + home()
    }
  }
  fun hamster(): Pet {
    val squeak = "Squeak"
    return Pet { squeak + home() }
  }
  fun goldfish(): Pet { // return an object
    val blub = "Blub" // local val
    return Pet { blub + home() } // produces blub + home() using SAM conversion
  }
}

fun main() {
  CreatePet.dog().speak() eq "Bark home!"
  CreatePet.cat().speak() eq "Meow home!"
  CreatePet.hamster().speak() eq "Squeak home!"
  CreatePet.goldfish().speak() eq "Blub home!"
}
