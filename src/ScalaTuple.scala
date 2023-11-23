

object ScalaTuple {
  def main(args: Array[String]) {
    val t1 = (1, "A")
    val t2 = Tuple2(1, "A")
    val tuple3 = (1, "One", "A") // tuple3: (Int, String, String)
    println(tuple3._1) // 1
    tuple3._2 // One
    tuple3._3 // A

    val (num, word, char) = (1, "One", 'A')
    num // 1
    word // One
    char // A

    val tuple = (1, 2, 3, 4)
    tuple.productIterator.foreach(println)
  }

}