```scala
class MyClass[T](val value: T) {
  override def equals(other: Any): Boolean = {
    other match {
      case that: MyClass[_] =>
        this.value == that.value
      case _ => false
    }
  }

  override def hashCode(): Int = value.hashCode()

  def myMethod(other: MyClass[T]): Boolean = {
    this.equals(other)
  }
}

object Main extends App {
  val obj1 = new MyClass[Int](10)
  val obj2 = new MyClass[Int](10)
  val obj3 = new MyClass[String]("hello")
  val obj4 = new MyClass[String]("hello")

  println(obj1.myMethod(obj2)) // true
  println(obj3.myMethod(obj4)) // true
  println(obj1.equals(obj3)) // false, now handles type differences correctly
}
```