object Array_Question6 {
  def main(args:Array[String]):Unit={
    var arr1 = Array(1,2,3,4,5,6)
    var sum = 0
    for(i<- 0 until arr1.length){
      sum = sum + arr1(i)
    }
    var avg = (sum.toDouble)/(arr1.length.toDouble)
    println(avg)
  }
}
