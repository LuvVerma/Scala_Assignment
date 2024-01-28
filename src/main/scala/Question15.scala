object Question15 {
  def main(args:Array[String]):Unit={
    //1st Way
    for(i <- 2 to 16){
      var j = i+1
      println(s"$i*$j")
    }
    //2nd Way
    for(i <- 2 to 16){
      var j = i+1
      var value = i*j
      println(value)
    }
  }
}
