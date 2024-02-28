object Whatsapp_Feb26_Question6 {
  def main(args:Array[String]):Unit={
    var arr = Array(6,3,8,2,5)
    var smallest = arr(0)
    //var present = false
    for(i<- 0 until arr.length){
      if(arr(i)<smallest){
        smallest=arr(i)
      }
    }
    println("Smallest element is "+smallest)
  }
}
