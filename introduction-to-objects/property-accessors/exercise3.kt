package propertyAccessorsExercise3
import atomictest.eq

class MessageStorage {
    private val _messages = mutableListOf<String>() // list of messages private property

    val messages: List<String> // list of messages public property
        get() {
            return _messages // could be done easier with simple one line: get() = _messages
        }

    fun addMessage(s: String) { // function to add messages to the list
        _messages.add(s)
    }

}

fun main() {
  val messageStorage = MessageStorage()
  messageStorage.addMessage("first")
  messageStorage.addMessage("second")
  messageStorage.messages eq listOf("first", "second")
 // doesn't compile:
//  messageStorage.messages.remove("first")
}
