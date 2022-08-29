package polymorphismExercise1

import atomictest.*

abstract class Character(val name: String) {
    abstract fun play(): String
}

interface Fighter {
    fun fight() = "Fight!"
}

interface Magician {
    fun doMagic() = "Magic!"
}

interface Flyer {
    fun fly() = "Fly!"
}

class Warrior :
    Character("Warrior"), Fighter {
    override fun play() = fight()
}

open class Elf(name: String = "Elf") :
    Character(name), Magician {
    override fun play() = doMagic()
}

class FightingElf :
    Elf("FightingElf"), Fighter {
    override fun play() =
        super.play() + fight()
}

class Dragon : Character("Dragon"), Flyer { // dragon character can fly by implementing flyer
    override fun play() = fly()
}

class Wizard : Character("Wizard"), Flyer, Magician { // wizard character can fly and do magic by implementing flyer and magician
    override fun play() = doMagic() + fly()
}

fun Character.playTurn() = name + ": " + play()

fun main() {
    listOf(
        Warrior(),
        Elf(),
        FightingElf(),
        Dragon(),
        Wizard()
    ).map { it.playTurn() } eq // test solution by making map of characters' turns
            "[Warrior: Fight!, Elf: Magic!, " +
            "FightingElf: Magic!Fight!, " +
            "Dragon: Fly!, Wizard: Magic!Fly!]"
}
