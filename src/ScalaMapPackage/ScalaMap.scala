package ScalaMapPackage

object ScalaMap {
  def main(args: Array[String]): Unit = {
    println("Step 1: How to initialize a Map with 3 elements")
    val map1: Map[String, String] = Map(("PD", "Plain Donut"), ("SD", "Strawberry Donut"), ("CD", "Chocolate Donut"))
    println(s"Elements of map1 = $map1")

    println("\nStep 2: How to initialize Map using key -> value notation")
    val map2: Map[String, String] = Map("VD" -> "Vanilla Donut", "GD" -> "Glazed Donut")
    println(s"Elements of map1 = $map2")

    println("\nStep 3: How to access elements by specific key")
    println(s"Element by key VD = ${map2("VD")}")
    println(s"Element by key GD = ${map2("GD")}")

    println("\nStep 4: How to add elements using +")
    val map3: Map[String, String] = map1 + ("KD" -> "Krispy Kreme Donut")
    println(s"Element in map3 = $map3")

    println("\nStep 5: How to add two Maps together using ++")
    val map4: Map[String, String] = map1 ++ map2
    println(s"Elements in map4 = $map4")

    println("\nStep 6: How to remove key and its value from map using -")
    val map5: Map[String, String] = map4 - ("CD")
    println(s"Map without the key CD and its value = $map5")

    println("\nStep 7: How to initialize an empty Map")
    val emptyMap: Map[String, String] = Map.empty[String, String]
    println(s"Empty Map = $emptyMap")

    
    
  }
}