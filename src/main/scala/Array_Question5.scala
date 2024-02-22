object Array_Question5 {
  def main(args:Array[String]):Unit={
    var arr1 = Array(1,2,3,4,5)
    var arr2 = Array(6,7,8,9,10)
    var arr = new Array[Int](arr1.length+arr2.length)
    var j = 0
    for(i<- 0 until arr1.length){
      arr(j) = arr1(i)
      j+=1
    }
    for(i<- 0 until arr1.length){
      arr(j) = arr2(i)
      j+=1
    }
    for(i<- 0 until arr.length){
      print(arr(i)+" ")
    }
  }
}
