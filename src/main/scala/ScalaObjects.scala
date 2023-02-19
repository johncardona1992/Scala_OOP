object ScalaObjects {
  // Scala does not have class-level functionality ("static")
  object Person {
    // "static"/"class"-level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method !!!!!!!!! act like a constructor
    def apply(mother: Person, father: Person): Person = new Person("Bobbie")

  }

  class Person(val name: String) {
    // instance-level functionality

  }
  // COMPANIONS
  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

    // scala objects are SINGLETON INSTANCE
    val mary = Person
    val john = Person
    println(mary == john)

    // scala instances
    val mary2 = new Person("marty")
    val john2 = new Person("John")
    println(mary2 == john2)

    val bobbie = Person(mary2, john2)

  }
  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit
}
