object Inheritance extends App {
  // single class inheritance
  class Animal {
    val specie = "Animal"
    val creatureType = "wild"
    def eat = println("eating!")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.eat

//    constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name) {}

  //   overRiding
  class Dog(override val specie: String) extends Animal {
    override val creatureType: String = "domestic"
    override def eat: Unit = println("crunch override!")
  }

  val dog = new Dog("Mammal")
  dog.eat
  println(dog.creatureType)
  println(dog.specie)

//   Polymorphism
  val unKnownAnimal: Animal = new Dog("K9")
  unKnownAnimal.eat
}
