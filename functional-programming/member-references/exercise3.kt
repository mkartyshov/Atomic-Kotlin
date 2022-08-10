package memberReferencesExercise3
import atomictest.eq

val Int.isEven: Boolean
  get() = this % 2 == 0

// Returns all the divisors of the number
// except 1 and the number itself
private fun getNonTrivialDivisors(num: Int): List<Int> {
  return (2 until num).filter { num % it == 0 } // get divisors of number except 1 and number
}

fun Int.isPrime(): Boolean {
  return this != 1 && getNonTrivialDivisors(this).isEmpty() // prime number != 1 and don't have non trivial divisors
}

fun isPerfect(num: Int): Boolean {
  return num != 1 && 1 + getNonTrivialDivisors(num).sum() == num // num != 1 and sum of non trivial divisors + 1 = num
}

fun main() {
  val range = 1..1000
  val even = range.filter(Int::isEven) // filter even numbers
  even.size eq 500 // amount of even numbers on range from 1 to 1000

  val prime = range.filter(Int::isPrime) // filter prime numbers
  prime.take(7) eq listOf(2, 3, 5, 7, 11, 13, 17) // take first 7 prime numbers from int
  prime.takeLast(7) eq
    listOf(953, 967, 971, 977, 983, 991, 997) // take last 7 prime numbers from int

  val perfect = range.filter(::isPerfect) // filter perfect numbers
  perfect eq listOf(6, 28, 496) // list of perfect numbers
  // 6 = 1 + 2 + 3
  // 28 = 1 + 2 + 4 + 7 + 14
}
