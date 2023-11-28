package ScalaClassPackage
// this practice is for default class constructor and Auxilary constructor
object ScalaClass4 {
  val DefaultCrustSize = 12
  val DefaultCrustType = "THIN"
  // default Constructor
  class Pizza1(var crustSize:Int=DefaultCrustSize,
               var crustType:String=DefaultCrustType)
  // auxilary 
  class Pizza(var crustSize:Int,var crustType :String){
    
    def this(crustSize:Int)={
      this(crustSize,DefaultCrustType)
      }
    
    def this(crustType:String)={
      this(DefaultCrustSize,crustType)
    }
    
    def this()={
      this(DefaultCrustSize,DefaultCrustType)
    }
  }  
  
  // Supplying Default Values for Constructor Parameters#
  class Socket(var timeout:Int=2000,var linger:Int=4000){
    override def toString()={s"timeout : $timeout and linger : $linger"}
  }
  def main(args:Array[String]){
    var p1=new Pizza(DefaultCrustSize,DefaultCrustType)
    var p2=new Pizza(DefaultCrustType)
    var p3=new Pizza(DefaultCrustSize)
    var p4=new Pizza()
    var p5=new Pizza1()
    var p6=new Socket()
    var p7=new Socket(4000)
    var p8=new Socket(10000,20000)
    
    println(p1)
    println(p2)
    println(p3)
    println(p4)
    println(p5)
    println(p6.toString())
    println(p7.toString())
    println(p8.toString())
    
    
  }
}







