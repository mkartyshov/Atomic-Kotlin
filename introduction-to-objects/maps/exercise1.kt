package mapsExercise1
import atomictest.eq

class Contact(val name: String, val number: String) {
  override fun toString(): String {
    return "Contact('$name', '$number')"
  }
}

fun buildNumberToContactMap(contactList: List<Contact>): Map<String, Contact> { // the function is taking a phone number and link it to name and number
  val contacts = mutableMapOf<String, Contact>() // creating a map with contacts
  for (contact in contactList) { // for each contact in contactList
    contacts[contact.number] = contact // [contact.number] here is looking up for a value
  } // so we're looking for a number of each contact
  return contacts // return the result
}

fun main() {
  val contactList = listOf(
    Contact("Miffy", "1-234-567890"),
    Contact("Cleo", "098-765-4321"),
  )
  val contactsByNumber = buildNumberToContactMap(contactList)
  contactsByNumber eq "{1-234-567890=Contact('Miffy', '1-234-567890'), " +
    "098-765-4321=Contact('Cleo', '098-765-4321')}"
}
