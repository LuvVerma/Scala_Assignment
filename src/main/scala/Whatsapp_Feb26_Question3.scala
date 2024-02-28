import scala.util.control.Breaks._
object Whatsapp_Feb26_Question3 {
  def main(args:Array[String]):Unit={
    var arr = Array(5,2,8,5,9)
    var present = false
    for(i<- 0 until arr.length){
      if(arr(i)==5){
        println("Yes, "+arr(i)+" is present in the array at index "+i)
        present = true
        break
      }
    }
    if(present==false){
      println("No, element is not present in the array!")
    }
  }
}
