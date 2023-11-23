
object Demo1 {
  def main(args: Array[String]) {
    // list

    for (ele1 <- 1 to 2) {
      println("Hello world")
    }
    val list1=List(1,2,6,8,3,8,9,0,3,5)
    for(value <- list1 if value%2==0){
      println("it is even number" +value)
    }
    def map(numbers: List[Int], f: Int => Int): List[Int] = {
  numbers.map(f)
}


  }
}