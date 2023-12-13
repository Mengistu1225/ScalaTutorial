package ScalaMethods

object IsLuckyScala {
  def main(args: Array[String]): Unit = {
    // Create a list of all positive integers
    val numbers = (1 to Int.MaxValue).toList

    // Create a function to check if a number is lucky
    def isLucky(number: Int): Boolean = {
      // A number is lucky if it is not divisible by any of the prime numbers less than or equal to its square root
      val sqrt = math.sqrt(number).toInt
      val primes = (2 to sqrt).filter(isPrime)
      !primes.exists(number % _ == 0)
      /*for (prime <- primes) {
        if (number % prime == 0) {
          return false
        }
      }*/

     /* val primes = (2 to math.sqrt(number).toInt).filter(isPrime)
      if (primes.isEmpty) {
        true
      } else {
        !primes.exists(number % _ == 0)
      }*/
    }

    // Filter the list of numbers to only include lucky numbers
    val luckyNumbers = numbers.filter(isLucky)

    // Print the list of lucky numbers
    println(luckyNumbers)
  }

  def isPrime(number: Int): Boolean = {
    // A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself
    if (number <= 1) {
      false
    } else {
      !(2 to math.sqrt(number).toInt).exists(number % _ == 0)
    }
  }

}