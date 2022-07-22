package listsExercise3
import atomictest.eq

fun checkAnagrams(s1: String, s2: String): Boolean {
  val list1: List<Char> = s1.toList() // convert string to list of chars
  val list2: List<Char> = s2.toList()
  // it could be done easier, using only one line
  return list1.sorted() == list2.sorted() // compare two lists after sorting them
}

fun main() {
  checkAnagrams("thing", "night") eq true
  checkAnagrams("leader", "dealer") eq true
  checkAnagrams("sector", "escort") eq true
  checkAnagrams("tablet", "battle") eq true
  checkAnagrams("friend", "finder") eq true
  checkAnagrams("senator", "treason") eq true
  checkAnagrams("terrain", "trainer") eq true
  checkAnagrams("teaching", "cheating") eq true

  checkAnagrams("pots", "stops") eq false
  checkAnagrams("escort", "sectors") eq false
  checkAnagrams("sections", "notices") eq false
}
