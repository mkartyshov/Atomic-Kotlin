package summaryIIExercise6
import atomictest.eq

class Temperature {
  private var current = 0.0 // by default we have 0.0 fahrenheit
  private var scale = "f"
/*
  fun setFahrenheit(now: Double) {
    current = now
    scale = "f"
  }
  fun setCelsius(now: Double) {
    current = now
    scale = "c"
  }
  fun getFahrenheit(): Double =
    if (scale == "f")
      current
    else
      current * 9.0 / 5.0 + 32.0
  fun getCelsius(): Double =
    if (scale == "c")
      current
    else
      (current - 32.0) * 5.0 / 9.0
}
*/
// instead of functions now we have properties with getters and setters
  var fahrenheit: Double
    set(now) { // call fahrenheit and show the temp
      current = now
      scale = "f"
    }
    get(): Double = // update the temp in fahrenheit
      if (scale == "f") // if the scale is f, then we return current
        current
      else // if the scale isn't f, then we convert current to celsius
        current * 9.0 / 5.0 + 32.0

  var celsius: Double
    set(now) { // call celsius and show the temp
      current = now
      scale = "c"
    }
    get(): Double = // update the temp in celsius
      if (scale == "c") // if the scale is c, then we return current
        current
      else // if the scale isn't c, then we convert current to celsius
        (current - 32.0) * 5.0 / 9.0
}

fun main() {
  val temp = Temperature()
  temp.fahrenheit = 98.6
  temp.fahrenheit eq 98.6
  temp.celsius eq 37.0
  temp.celsius = 100.0
  temp.fahrenheit eq 212.0
}
