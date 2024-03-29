package companionObjectsExercise1
import atomictest.*

interface Vendor {
  fun pencil()
  fun pen()
}

interface VendorFactory {
  fun create(): Vendor
}
// Vendor1 and Vendor2 that implement Vendor:
class Vendor1 private constructor() : Vendor {
  // report the class name and "pencil" or "pen":
  override fun pencil() = trace("Vendor1 pencil")
  override fun pen() = trace("Vendor1 pen")
  companion object {
    var factory = object : VendorFactory { // implements VendorFactory
      override fun create() = Vendor1()
    }
  }
}

class Vendor2 private constructor() : Vendor {
  // report the class name and "pencil" or "pen":
  override fun pencil() = trace("Vendor2 pencil")
  override fun pen() = trace("Vendor2 pen")
  companion object {
    var factory = object : VendorFactory { // implements VendorFactory
      override fun create() = Vendor2()
    }
  }
}

fun consumer(factory: VendorFactory) { // uses factory to create a Vendor
  val vendor = factory.create()
  vendor.pencil() // call pencil()
  vendor.pen() // call pen()
}

fun main() {

// Implementations are interchangeable:
  consumer(Vendor1.factory)
  consumer(Vendor2.factory)
  trace eq """
  Vendor1 pencil
  Vendor1 pen
  Vendor2 pencil
  Vendor2 pen
  """
}
