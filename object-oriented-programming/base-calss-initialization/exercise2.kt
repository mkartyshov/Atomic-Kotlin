package baseClassInitializationExercise2

import atomictest.trace
import logging.trace

open class Plate(description: String) {
    init {
        trace("Plate-$description")
    }
}

class DinnerPlate : Plate("DinnerPlate")

open class Utensil(description: String) {
    init {
        trace("Utensil-$description")
    }
}

class Spoon : Utensil("Spoon")

class Fork : Utensil("Fork")

class Knife : Utensil("Knife")

open class Custom {
    init {
        trace("Custom")
    }
}

class PlaceSetting : Custom() { // create properties of type Spoon, Fork, Knife and DinnerPlate
    val spoon = Spoon()
    val fork = Fork()
    val knife = Knife()
    val dinnerPlate = DinnerPlate()
    init {
        trace("PlaceSetting") // show the initialization order
    }
}

fun main() {
    PlaceSetting()
    trace eq """
    Custom
    Utensil-Spoon
    Utensil-Fork
    Utensil-Knife
    Plate-DinnerPlate
    PlaceSetting
  """
}
