package ScalaClassPackage

object ScalaClass3 {
  class Stock(var sysmbol:String,var price:Double)
  class Socket(var timeout:Int,var linger:Int){
    override def toString()=s"timeout: $timeout linger: $linger "
  }
  class Address(var street1:String,
                var street2:String,
                var city:String,
                var state:String)
  def main(args:Array[String]){
    var stock=new Stock("amazon",200)
    var socket=new Socket(1200,200)
    var address=new Address("bole","kolloge","adama","oromia")
    
    println(stock.sysmbol,stock.price)
    println(socket.toString())
    println(address.street1,address.street2,address.city,address.state)
    
  }
  
}