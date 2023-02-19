object MethodNotations extends App {
  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    // operator overloading
    def +(person: Person): String =
      s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name is working!"
    def apply() : String = s"$name is working with apply!"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  // infix notation or operator notation, only works with methods with one parameter
  println(mary likes "Inception")

  val tom = new Person("Tom", "Fight club")
  // operator overloading
  println(mary + tom)
  // all operators are methods
  println(1 + 2)
  println(1.+(2))

  // prefix notation
  val x = -1
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !
  println(!mary)
  //apply operator
  println(mary.apply())
  println(mary())
}
