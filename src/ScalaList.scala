

object ScalaList {
  def main(args:Array[String]){
    /*val list1:List[Any]=List("mengistu","araya","kebede","efrem",12)
    val list2=List("etsay","haftamu","haftu","mogos","tesfay",12)
    
    println(list1)
    println(list2)
    print(list1.take(2));
    println(list1.drop(2));
    println(list1.splitAt(2))
    
    for(list ← list1){
      println(list)
    }
    println("--------")
    for(ele ← list2){
      println(ele)
    }*/
    
   /* val twodlist: List[List[Int]] =
        List( 
            List(1, 0, 0), 
            List(0, 1, 0), 
            List(0, 0, 1) 
            ) 
        println(twodlist)
        
        for (ele ← twodlist){
          println(ele(1))
        }*/
   /* val language:List[Any]=List("python","c#","java","c++","php")
    println(language)
    println(language.head)
    println(language.tail)
    println(language.isEmpty)
    
    val prolanguage=List.fill(8)("scala")
    println(prolanguage)
    
     val num1=List(2,4,6,8,9,0,4,2,5,7,5,4)
     val num2=List(56,8,3,7,8,90,2,4,5,7,2,1,4)
   
     print(num1.reverse)
     println(num2.length)
       println(num1::num2)
         println(num1++num2)*/
    
    val value=List(2,4,5,6,72,5,6,9,3,57)
    println(value.map { x => x*x})
    println(value.filter { x => x%2==0})
    println(value.foldRight(8)(_+_))
    val x=List(2,4,5,6,72,5,6,9,3,57)
    println("Output of Tabulate method is = " + (List.tabulate(5)(x => x * x * x)));
  }
  
}