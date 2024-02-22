object Array_Question2 {
  def main(args:Array[String]):Unit={
    var arr = Array(1,2,3,4,5)
    println(array_sum(arr))
  }
  def array_sum(Arr: Array[Int]): Int = {
    var sum = 0
    for(i<- 0 until Arr.length){
      sum = sum + Arr(i)
    }
    return sum
  }
}
