package enumerationsExercise2
import atomictest.eq
import enumerationsExercise2.Month.*
import enumerationsExercise2.Season.*

enum class Month {
  January, February, March, April,
  May, June, July, August,
  September, October, November, December
}

enum class Season {
  Winter, Spring, Summer, Autumn
}

fun Month.getAustralianSeason(): Season = when (this) { // different seasons in australia
  December, January, February -> Summer // when we call for month, we return the season
  March, April, May -> Autumn
  June, July, August -> Winter
  September, October, November -> Spring
}

fun Month.getDays(leapYear: Boolean = false): Int = when (this) {
  January, March, May, July, August, October, December -> 31 // when we call for month, we return amount of days
  April, June, September, November -> 30
  February -> if (leapYear) 29 else 28 // 29 or 28 fays for february
}

fun main() {
  January.getAustralianSeason() eq Summer
  May.getAustralianSeason() eq Autumn

  January.getDays() eq 31
  February.getDays(leapYear = false) eq 28
  February.getDays(leapYear = true) eq 29
}
