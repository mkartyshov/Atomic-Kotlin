package secondaryConstructorsExercise1
import atomictest.eq

data class Flower1(val type: String) {
    constructor() : this("Daisy") // secondary constructor to the class; initializes type to Daisy
}

data class Flower2(val type: String = "Daisy") //Daisy is a default argument to constructor

fun main() {
    Flower1().type eq "Daisy"
    Flower2().type eq "Daisy"
}
