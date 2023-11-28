

package ScalaClassPackage

object ScalaClass {
  class Person(var name:String,var age:Int,var skill:String)
  
  def main(args:Array[String]){
    var stu=new Person("mengistu",26,"Scala Developer")
    
    println(stu.name)
    println(stu.age)
    println(stu.skill)
   
  }
  
}