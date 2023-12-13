trait shap{
  def area():Double
}
class rectangle(var w:Double,var h:Double) extends shap{
  override def area()={
    w*h
  }
}
class circle(var r:Int) extends shap{
  def area()={
    3.413*r*r
  }
}

object Main {
  def  main(args: Array[String]): Unit = {
    var rec=new rectangle(12.0,13.0)
    println("the area of rectangle is: "+rec.area())
    var cir=new circle(12)
    println("the area of circe is: "+cir.area())
    
  }
  
}