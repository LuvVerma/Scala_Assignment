object Pattern_Question7 {
  def main(args:Array[String]):Unit={
    var a = 7
    for(i<- 1 to 4){
      for(k<- 1 to i-1){
        print(" ")
      }
      for(j<- a to 1 by -1){
        print("* ")
      }
      println()
      println()
      a-=2
    }
    a = 1
    for(i<- 1 to 4){
      for(k<- 1 to 4-i){
        print(" ")
      }
      for(j<- 1 to a){
        print("* ")
      }
      println()
      println()
      a+=2
    }
  }
}
