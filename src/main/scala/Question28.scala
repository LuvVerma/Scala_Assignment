object Question28 {
  def main(args:Array[String]):Unit={
    var i = 1
    while (i<=25){
      if(i%5==0){
        println("divisible by five")
      }
      else{
        println(i)
      }
      i+=2
    }
  }
}
