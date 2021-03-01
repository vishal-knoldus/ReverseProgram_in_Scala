
import scala.annotation.tailrec
object ReverseList{
  @tailrec
  def reverseList(oldList : List[Int],newList : List[Int]) : List[Int] = {
    if(oldList.isEmpty){
      newList
    }
    else
      {
        reverseList(oldList.tail , oldList.head :: newList)
      }
  }
  def main(args: Array[String]): Unit = {
    val List1 = List(1,2,3,4,5)
    println(reverseList(List1,Nil))
    val List2 = List(10,11,23,14)
    println(reverseList(List2,Nil))

  }
}