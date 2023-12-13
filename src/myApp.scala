

object myApp {
  var message:String=""
  def  main(args: Array[String]): Unit = {
    println("hello world")
    myApp.getMessage("hello mengistu scala programmer")
    
  }
  def getMessage(message:String):Unit={
    println(message)
  }
  
}