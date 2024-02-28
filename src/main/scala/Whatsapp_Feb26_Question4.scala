object Whatsapp_Feb26_Question4 {
  def main(args:Array[String]):Unit={
    var count = 0
    var arr = Array(7,2,9,3,7,5,7)
    //var present = false
    for(i<- 0 until arr.length){
      if(arr(i)==7){
        count +=1
      }
    }
    println("Total no. of occurrences of 7 in the array is "+count)
  }
}
