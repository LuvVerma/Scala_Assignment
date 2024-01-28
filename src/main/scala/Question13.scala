object Question13 {
  def main(args:Array[String]):Unit={
    var i = 0
    for(n <- 20 to 140){
      if(n%2==0){
        if(i==0){
          println(n)
          i=1
        }
        else{
          i=0
        }
      }
    }
  }
}
