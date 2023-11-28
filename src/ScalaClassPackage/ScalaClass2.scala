package ScalaClassPackage

object ScalaClass2 {
  class Person1(var name:String,var Lname:String){
    var age=26
    private var Home=System.getProperty("user.home")
    
    override def toString():String =s"$name $Lname is $age years old"
    def getHome():Unit=(s"Home = $Home")
    def getFullName():Unit=println(this)
    
    
    
  }
  def main(args:Array[String]){
    var person=new Person1("Mengistu","Araya")
    println(person.toString())
    println(person.getHome())
    println(person.getFullName())
    
  }
  
}