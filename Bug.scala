```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): Boolean = {
    this.value == other.value
  }
}

object Main extends App {
  val obj1 = new MyClass[Int](10)
  val obj2 = new MyClass[Int](10)
  val obj3 = new MyClass[String]("hello")
  val obj4 = new MyClass[String]("hello")

  println(obj1.myMethod(obj2)) // true
  println(obj3.myMethod(obj4)) // true
}
```