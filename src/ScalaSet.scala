

object ScalaSet {
  def main(args:Array[String]){
   /* val emptySet:Set[Int]=Set()
    println(emptySet)
    val set1:Set[Int]=Set(1,4,2,3,5,6,7,6)
    
    println(set1)
    println(set1.head)
    println(set1.tail)
    println(set1.isEmpty)
    println(set1.isInstanceOf)*/
    
    val set2:Set[Int]=Set(6,7,8,9,3,2,0)
    if(set2.contains(3))
      println("  set2 is contain  5")
     else
       println("set2 is no contain  5")

    val fruitSet: Set[String] = Set("apple", "banana", "orange")
    val intersectionSet: Set[String] = fruitSet.intersect({"banana", "cherry"})

     println(intersectionSet)

    
    
    
    
  }
  }