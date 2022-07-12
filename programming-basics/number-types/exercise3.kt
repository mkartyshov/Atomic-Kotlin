package numberTypesExercise3

// creating functions to convert F to C and vice versa

fun convertFahrenheitToCelsius(f: Int): Double =
  (f - 32.0) * 5 / 9

fun convertCelsiusToFahrenheit(c: Int): Double =
  c * 9 / 5.0 + 32

fun main() {
  println(convertFahrenheitToCelsius(68)) // 20.0
  println(convertCelsiusToFahrenheit(20)) // 68.0
}
