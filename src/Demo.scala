
object Demo {
  def main(args:Array[String]){
    
    val num1=12
    val num2=13
    val num3=23
    val largest=if(num1>num2 && num1>num3){
      num1 }
    else if(num2>num1 && num2>num3 )
        {num2} 
    else 
      {num3}
    
    println("the largest number is : " +largest)
    
    
    
    
     val list1=List(1,3,4,6,2,6,8,4,0)
     for(ele <- list1){
       println(ele)
     }
     val map1=Map("mengistu"-> 12,"kebede"-> 32,"efrem"->54)
     for((name,age)<-map1){
       println(name,age)
     }
    
  }
  
}