package bbb
import aaa.* // import everything from aaa.kt

fun g(i: Int): String = "${K()} ${fa(i)}" // function returns String, using members from aaa.kt
