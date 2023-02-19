object Case_Classes extends App {
  case class Person(name: String, age: Int)

//   1. on case classes, parameters become class fields
  val jim = new Person("Jim", 34)
  println(jim.name)
//   2. sensible toString
  println(jim)
//   3. equals and hasCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)
//   4. Case Classes have handy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3)

//   5. Case Classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

// 6.  Case Classes are serializable
// Akka
// 7. Case Classes have extractor patterns that can be used in PATTERN MATCHING
// 
}
