object Pattern_Question5 {
  def main(args:Array[String]):Unit={
    for(i<- 1 to 5){
      for(j<- 1 to i){
        if(j==i){
          print("*")
        }
        else{
          print("*_")
        }
      }
      println()
    }
  }
}
