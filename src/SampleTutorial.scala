

object SampleTutorial {
  def main(args:Array[String]){
    println(" hello Mengistu Scala Programmer")
     // range in scala
    for(x ← 1 to 10){
      println(x)
    }
    println("----")
    for(y ← 1.to(10)){
      println(y)
    }
    // operator in scala
    println(10+20)
    println(10.+(20))
    
    // methods in scala
    def squar(x:Double):Double=x*x
   println( squar(3.0))
    
    def sumSquar(x:Double,y:Double):Double=squar(x)+squar(y)
    println(sumSquar(3.0,4.0))
    
    
  }
  
}