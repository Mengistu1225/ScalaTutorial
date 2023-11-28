package ScalaMethods

object ScalaMethods1 {
   
    //defining methods with out return type in single line
    def add(a:Int,b:Int)=a+b
    // defining methods with return tye in single line
    def add1(a:Int,b:Int):Int=a+b
    // defining methods with multiline with out return type
    def addThenDouble(a :Int,b:Int)={
      var sum=a+b
      var doubled=sum*2
      doubled
    }
     // defining methods with multiline with  return type
     def addThenDoubled(a :Int,b:Int)={
      var sum=a+b
      var doubled=sum*2
      doubled
    }
    def main(args:Array[String]){
      println(add(4,5))
      println(add1(60,54))
      println(addThenDouble(4,6))
      println(addThenDoubled(10,10))
    
  }
  
}