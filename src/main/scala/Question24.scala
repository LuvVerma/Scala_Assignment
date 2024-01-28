object Question24 {
  def main(args:Array[String]):Unit={
    var a = 0
    for(i<- 1 to 7){
      if(a==0){
        print(5)
        a=1
      }else{
        print(10)
        a=0
      }
      if(i!=7){
        print(",")
      }
    }
  }
}
