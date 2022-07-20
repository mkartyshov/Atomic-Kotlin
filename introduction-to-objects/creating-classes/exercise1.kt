package creatingClassesExercise1

// creating a class named SomeClass with three member functions

class SomeClass {
    fun a() = println("42") // display 42
    fun b() = a() // call fun a()
    fun c() = this.b() // call fun b() by qualifying it
}
