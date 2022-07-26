package summaryIIExercise8
import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> = mapOf(
  "M" to 1000,
  "CM" to 900,
  "D" to 500,
  "CD" to 400,
  "C" to 100,
  "XC" to 90,
  "L" to 50,
  "XL" to 40,
  "X" to 10,
  "IX" to 9,
  "V" to 5,
  "IV" to 4,
  "I" to 1)

fun convertFromRoman(roman: String): Int {
  var final = 0 // final result by default is zero
  var x = 0
  for (romanNumeral in roman.reversed()) { // getting the roman number in reverse
    val int = romanNumeralToIntMap.getValue("$romanNumeral") //
    if (int >= x) { // if the next int is greater than x
      final += int // we add int to final result
      x = int // set x to int
    } else { // if the next int isn't greater than x
      final -= int // then subtract int from final (for IV, IX, etc)
    }
  }
  return final
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}
