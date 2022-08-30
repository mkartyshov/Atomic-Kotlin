package classDelegationExercise3
import atomictest.*

interface A {
    fun foo()
    fun bar()
}

interface B {
    fun foo()
    fun baz()
}

class AA : A { // class AA that implements A and traces "A.foo()" for foo() and "A.bar()" for bar()
    override fun foo() = trace("A.foo()")
    override fun bar() = trace("A.bar()")
}

class BB : B { // class BB do the same as AA, but for B
    override fun foo() = trace("B.foo()")
    override fun baz() = trace("B.baz()")
}

class Delegation(val a: A, val b: B) : // class Delegation delegates to both A and B.
    A by a, B by b {
    override fun foo() {
      a.foo()
      b.foo()
      trace("Delegation.foo()")
    }
}

fun main() {
    val d = Delegation(AA(), BB())
    d.foo()
    d.bar()
    d.baz()
    trace eq
            """
      AA.foo()
      BB.foo()
      Delegation.foo()
      AA.bar()
      BB.baz()
    """
}
