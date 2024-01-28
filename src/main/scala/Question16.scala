object Question16 {
  def main(args:Array[String]):Unit={
    var sum = 0
    for(num <- 382 to 582){
      if(num%2==0){
        sum = sum + num
      }
    }
    println(sum)
  }
}
