package baseClassInitializationExercise1

open class A(val s: String) // open class A

open class B(s: String) : A(s) // open class B inherited from class A

class C(s: String) : B(s) // final class C inherited from class B
