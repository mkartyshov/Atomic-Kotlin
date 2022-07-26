package summaryIIExercise4

import atomictest.capture
import atomictest.eq

class Dictionary() {
    private var _translations = mutableMapOf<String, List<String>>() // we create an auxiliary property with mutable map of translations

    val translations: Map<String, List<String>>
        get() = _translations // we return the _translations from here as a read-only Map

    fun addTranslations(word: String, translation: String) { // function to add new words and translations
        if (_translations.contains(word)) { // if our _translations map already contains word
            throw IllegalArgumentException("Dictionary already has translations for '$word'") // then we have an exception
        }
        _translations[word] = translation.split(" ") // otherwise we add a new word to _translations map
    }
}

fun main() {
    val dictionary = Dictionary()
    dictionary.addTranslations("apple", "Apfel")
    dictionary.addTranslations("cake", "Kuchen Torte")

    dictionary.translations eq mapOf(
        "apple" to listOf("Apfel"),
        "cake" to listOf("Kuchen", "Torte")
    )

    capture {
        dictionary.addTranslations("cake", "Törtchen")
    } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"
    // shouldn't compile:
//  dictionary.translations.remove("apple")
}
