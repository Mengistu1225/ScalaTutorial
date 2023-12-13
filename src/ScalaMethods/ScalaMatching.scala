/*package ScalaMethods

object ScalaMatching extends App {
  case class Person(firstName: String, lastName: String)
    case class Dog(name: String)

    // trigger the constant patterns
    println(echoWhatYouGaveMe(0))
    println(echoWhatYouGaveMe(true))
    println(echoWhatYouGaveMe("hello"))
    println(echoWhatYouGaveMe(Nil))

    // trigger the sequence patterns
    println(echoWhatYouGaveMe(List(0,1,2)))
    println(echoWhatYouGaveMe(List(1,2)))
    println(echoWhatYouGaveMe(List(1,2,3)))
    println(echoWhatYouGaveMe(Vector(1,2,3)))

    // trigger the tuple patterns
    println(echoWhatYouGaveMe((1,2)))         // two element tuple
    println(echoWhatYouGaveMe((1,2,3)))       // three element tuple

    // trigger the constructor patterns
    println(echoWhatYouGaveMe(Person("Melissa", "Alexander")))
    println(echoWhatYouGaveMe(Dog("Suka")))

    // trigger the typed patterns
    println(echoWhatYouGaveMe("Hello, world"))
    println(echoWhatYouGaveMe(42))
    println(echoWhatYouGaveMe(42F))
    println(echoWhatYouGaveMe(Array(1,2,3)))
    println(echoWhatYouGaveMe(Array("coffee", "apple pie")))
    println(echoWhatYouGaveMe(Dog("Fido")))
    println(echoWhatYouGaveMe(List("apple", "banana")))
    println(echoWhatYouGaveMe(Map(1->"Al", 2->"Alexander")))

    // trigger the wildcard pattern
    println(echoWhatYouGaveMe("33d"))
  
}*/