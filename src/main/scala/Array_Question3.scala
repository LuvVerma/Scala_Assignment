object Array_Question3 {
  def main(args:Array[String]):Unit={
    var arr = Array("Rohit","Mukesh","Ramesh","Suresh","Luv")
    var arr1 = new Array[String](arr.length)
    var j = 0
    for(i<- arr.length-1 to 0 by -1){
      arr1(j) = arr(i)
      j+=1
    }
    for(i<- 0 until arr1.length){
      println(arr1(i))
    }

  }
}
