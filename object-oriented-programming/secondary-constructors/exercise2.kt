package secondaryConstructorsExercise2
import atomictest.eq

data class SpaceShip(val name: String) {
    constructor(shipClass: String, model: Int) // secondary constructor that takes two parameters
            : this("$shipClass-$model") // builds an object with specific name
}

fun main() {
    SpaceShip("SuperHighSpeedShip") eq
            "SpaceShip(name=SuperHighSpeedShip)"
    SpaceShip("MClass", 29321) eq
            "SpaceShip(name=MClass-29321)"
}
