

object ScalaFFunction {
  def main(args:Array[String]){
    /*val add=(x:Int,y:Int) ⇒x+y
    println(add(10,20))
    val list1=List(1,3,5,7,2,8,9,7)
    val twiseList1=list1.map(_*2)
    println(twiseList1)*/
    
    /*def area(radius:Double):Double={3.14*radius*radius}
    println(area(3.1))
    
*/ 
    def triple(x:Int):Int=x*3
    def addTen(y:Int):Int=y+20
    val list2=List(2,4,6,8,9,3,4,2)
    val result=list2.map(triple).map(addTen)
    println(result)
    
    
    def safeDivder(x:Int,y:Int):Either[String,Int]= {
       if(y == 0) Left(" can not dived by zero")
       else Right(x/y)
    }
    println(safeDivder(100,20))
    println(safeDivder(10,0))
      
       
    
        
    
      
      
    
    
    
  }
  
}