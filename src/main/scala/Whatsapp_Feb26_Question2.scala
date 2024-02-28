import scala.util.control.Breaks._
object Whatsapp_Feb26_Question2 {
  def main(args:Array[String]):Unit={
    var arr = Array(4,8,12,15,6)
    var present = false
    for(i<- 0 until arr.length){
      if(arr(i)==15){
        println("Yes, "+arr(i)+" is present in the array!")
        present = true
        break
      }
    }
    if(present==false){
      println("No, element is not present in the array!")
    }
  }
}
