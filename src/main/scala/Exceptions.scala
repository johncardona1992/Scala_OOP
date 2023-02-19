object Exceptions extends App {
  val x: String = null
//   throw new NullPointerException

// catch exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("no Int for you!")
    else 42

  val potentialFail =
    try {
      getInt(false)
    } catch {
      case e: RuntimeException => println("caught a run time exception")
    } finally {
      println("finally")
    }

  println(potentialFail)

//   define a custom class for exceptions
  class MyException extends Exception
  val exception = new MyException

//   throw exception
}
