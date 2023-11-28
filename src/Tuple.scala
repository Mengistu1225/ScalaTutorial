class Person(var name:String)

class Something(var id:Int,age:Int,person:Person)

object Tuple {
   def main(args:Array[String]){
     var tuple1=(12,"somthing",new Person("Mengistiu"))
     println(tuple1)
     println(tuple1._2)
     
     def getStockInfo={(10,1234,678,432,"mengusij","programmer")}
     
     val (id1,id2,id3,id4,name,skill)=getStockInfo
   }
  
}