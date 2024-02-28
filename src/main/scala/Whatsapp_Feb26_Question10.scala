object Whatsapp_Feb26_Question10 {
  def main(args:Array[String]):Unit={
    var arr = Array(14,5,8,12,9)
    var max = arr(0)
    var index = 0
    for (i <- 0 until arr.length) {
      if (arr(i)>max) {
        max=arr(i)
        index=i
      }
    }
    println("The max element in the array is "+max+" at index "+index)
  }
}
