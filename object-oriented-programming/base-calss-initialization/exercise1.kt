package baseClassInitializationExercise1

open class A(val s: String)

open class B(s: String) : A(s)

class C(s: String) : B(s)
