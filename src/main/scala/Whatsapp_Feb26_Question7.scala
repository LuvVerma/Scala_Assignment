object Whatsapp_Feb26_Question7 {
  def main(args:Array[String]):Unit={
    var arr = Array(4,8,2,11,6,11,7)
    var index = -1
    for(i<- 0 until arr.length){
      if(arr(i)==11){
        index=i
      }
    }
    if(index==(-1)){
      println("No, element is not present in the array!")
    }
    else {
      println("The last occurrence of 11 in the array is at index "+index)
    }
  }
}
