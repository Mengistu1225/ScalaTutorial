package ScalaMethods

object ScalaTraits {
  trait TailWagger1 {
    def startTail() = Unit
    def stopTail() = Unit
    def hello(): String = s"hello menge programmer"

  }
  class Dog extends TailWagger1 {
    def startTail(): Unit = println("this is starting Function")
    def stopTail(): Unit = println("this is soping function")
  }
  def main(args:Array[String]){
    var dog=new Dog()
    dog.startTail()
    dog.stopTail()
    dog.hello()
  }
  
}
