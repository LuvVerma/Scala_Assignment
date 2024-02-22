object String_Question7 {
  def main(args:Array[String]):Unit= {
    var str = "Betty bought a bit of butter"
    var arr = Array('a','e','i','o','u','A','E','I','O','U')
    var count = 0
    for(i<- 0 until str.length()){
      for(j<- 0 until arr.length){
        if(str(i)==arr(j)){
          count+=1
        }
      }
    }
    println("Number of vowels = "+count)
  }
}
