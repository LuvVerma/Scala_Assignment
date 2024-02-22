object Array_Question8 {
  def main(args:Array[String]):Unit={
    var arr = Array(1,2,3,4,5,6,7,8,9,10)
    var count = 0
    for(i<- 0 until arr.length){
      if(arr(i)%2!=0){
        count+=1
      }
    }
    var arr2 = new Array[Int](count)
    var j = 0
    for(i<- 0 until arr.length){
      if(arr(i)%2!=0){
        arr2(j)=arr(i)
        j+=1
      }
    }
    arr = arr2
    for(i<- 0 until arr.length){
      print(arr2(i)+" ")
    }
  }
}
