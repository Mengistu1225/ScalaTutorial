

object ScalaMap {
  def main(args:Array[String]){
    /*val capitals=Map("france"→"paris","germeny"→"berlin","italy"→"roma")
    val menths=Map(1→"january",2→"faburary",3→"march")
    println(capitals)
    println(menths)
    println(capitals("france"))
    val capitalOfSpain = capitals.getOrElse("Spain", "Madrid")
    println(capitalOfSpain)
    println(capitals.size)
    println(capitals.keys)
    println(capitals.values)
    println(capitals.get("france"))
    println(capitals + ("Spain" -> "Madrid"))
    println(capitals - "italy")*/
    
    val people = Map(
    "Michael" -> "25", 
    "Ross" -> "27", 
    "Ali" -> "21"
    )
    // check if map is empty
    println("Is the Map empty? ", people.isEmpty)
    println( "Keys : " + people.keys )
    println( "Values : ")
    people.values.foreach(println)
    
    // Iterating each key-value pair
    people.keys.foreach{ i =>  
    print( "Key = " + i )
    println(", Value = " + people(i))
    }
    // We can also access indivdual values based on keys.
    println(people("Michael"))

    // one can join two maps using ++ operator
    println("Joining two maps together")
    val people1 = Map(
    "Andrew" -> "33", 
    "Indiana" -> "54", 
    "Peter" -> "12"
    )

    val people2 = people ++ people1
    people2.keys.foreach{ i =>  print( "Key = " + i )
      println(", Value = " + people2(i))
    }

  }
}