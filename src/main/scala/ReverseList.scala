object ReverseList {
  def revList(myList : List[Int]): List[Int] = {
    var myNewList : List[Int] = List.empty[Int]
    var size : Int = myList.size -1


    while (size >= 0) {
      val newVal : Int = myList(size)
      myNewList = myNewList :+ newVal
      size -= 1
    }
      myNewList

  }
  def main(args: Array[String]): Unit = {
    val myList = List(1,2,3,4,5,6)
    val myNewList : List[Int] = revList(myList)
    println(myNewList)

  }
}
