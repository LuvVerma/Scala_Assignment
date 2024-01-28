object Question19 {
  def main(args:Array[String]):Unit={
    var sum = 0
    for(num <- 5 to 102){
      var square = num*num
      sum = sum+square
    }
    println(sum)
  }
}
