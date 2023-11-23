

object tutor1 {
  def main(args: Array[String]){

    def isLuckyNumber(n: Int): Boolean = {
      val digits = n.toString.split("").map(_.toInt)
      var isLucky = true
      var seenDigits = Set[Int]()

      for (digit <- digits) {
        if (seenDigits.contains(digit)) {
          isLucky = false
          return isLucky
        } else {
          seenDigits += digit
        }
      }

      isLucky
    }

    val inputNumber = 11
    if (isLuckyNumber(inputNumber)) {
      println(inputNumber + " is a lucky number")
    } else {
      println(inputNumber + " is not a lucky number")
    }

  } 

}