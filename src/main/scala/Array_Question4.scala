object Array_Question4 {
  def main(args:Array[String]):Unit={
    var arr = Array(1.67,2.56,3.12,4.67890,5.5421)
    var max:Double = 0
    for(i<- 0 until arr.length){
      if(arr(i)>max){
        max = arr(i)
      }
    }
    println(max)
  }
}
