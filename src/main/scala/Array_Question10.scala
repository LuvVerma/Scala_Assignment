object Array_Question10 {
  def main(args:Array[String]):Unit={
    var arr = Array(1,2,3,4,5)
    var arr2 = arr.sorted
    var sorted = true

    for(i<- 0 until arr.length){
      if(arr(i)!=arr2(i)){
        sorted=false
      }
    }
    if(sorted){
      println("Array is sorted!")
    }
    else{
      println("Array is not sorted!")
    }
  }
}
