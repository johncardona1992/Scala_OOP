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
    override def eat: Unit = {
      // call method from parent class
      super.eat
      println("crunch override!")
    }
  }

  val dog = new Dog("Mammal")
  dog.eat
  println(dog.creatureType)
  println(dog.specie)

  //   Polymorphism
  val unKnownAnimal: Animal = new Dog("K9")
  println(unKnownAnimal.specie)
  unKnownAnimal.eat

  // OverRiding vs Overloading
//   Overriding: supply a different implementation in derived classes
//   overLoading: supply multiple methods with different signatures but with the same name within the same class

// super: reference a method or field from the Parent Class

// preventing overrides
// use final on before the class declaration to prevent overriding of the entire class
  final class Horse(override val specie: String) extends Animal {
    override val creatureType: String = "domestic"
    override def eat: Unit = {
      // call method from parent class
      super.eat
      println("crunch override!")
    }
  }

    class Spider(override val specie: String) extends Animal {
    override val creatureType: String = "domestic"
    // use final on before the method declaration to prevent overriding
    final override def eat: Unit = {
      // call method from parent class
      super.eat
      println("crunch override!")
    }
  }

//   sealed, prevent overriding in a different file
    sealed class Rabbit(override val specie: String) extends Animal {
    override val creatureType: String = "domestic"
    // use final on before the method declaration to prevent overriding
    final override def eat: Unit = {
      // call method from parent class
      super.eat
      println("crunch override!")
    }
  }
}
