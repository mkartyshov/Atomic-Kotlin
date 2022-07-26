package summaryIIExercise7
import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf( // we set the map of arab and roman numbers
  1000 to "M",
  900 to "CM",
  500 to "D",
  400 to "CD",
  100 to "C",
  90 to "XC",
  50 to "L",
  40 to "XL",
  10 to "X",
  9 to "IX",
  5 to "V",
  4 to "IV",
  1 to "I")

fun convertToRoman(number: Int): String { // function to convert arab to roman
  var final = ""
  var x = number // remainder
  for ((int, r) in intToRomanNumeralMap) { // for numbers from roman numeral map
    val z = x / int // how many times we have to repeat the roman number
    final += r.repeat(z) // now we repeat the roman letter r for z times
    x %= int // move to the next letter
  }
  return final
}

fun main() {
  convertToRoman(23) eq "XXIII"
  convertToRoman(44) eq "XLIV"
  convertToRoman(100) eq "C"
  convertToRoman(2018) eq "MMXVIII"
}
