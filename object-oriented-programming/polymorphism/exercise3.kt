package polymorphismExercise3
import atomictest.trace

interface Connection { // interface with a member function
    fun send(message: String)
}
// implement interface Connection as classes, that override send() so it calls trace() with a String:
class Text : Connection {
    override fun send(message: String) = trace("'$message' via Text")
}

class Phone : Connection {
    override fun send(message: String) = trace("'$message' via Phone")
}

class Email : Connection {
    override fun send(message: String) = trace("'$message' via Email")
}

class Message(val text: String, val connection: Connection) { // class Message that takes constructor arguments
    fun transmit() = connection.send(text) // send text message via connection
}

fun main() {
  listOf(
    Message("We", Text()),
    Message("Are", Phone()),
    Message("Fine", Email())
  ).forEach { it.transmit() }
  trace eq """
    'We' via Text
    'Are' via Phone
    'Fine' via Email
  """
}
