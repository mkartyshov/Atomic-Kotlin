package repetitionWithWhileExercise1

// function that displays each character of String on the new line

fun displayContent(s: String) {
    var i = 0
    while (i < s.length) {
        println(s[i])
        i++
    }
}

fun main() {
    displayContent("abc")
}
