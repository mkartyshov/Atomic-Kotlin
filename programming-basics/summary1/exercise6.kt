fun everyFifthNonSpace(s: String) {
  var x = 1
  for (c in s) {
    if (x % 5 == 0 && c != ' ') { // check if c is every fifth and not blank
      println(c)
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
