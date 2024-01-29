object Pattern_Question4 {
  def main(args:Array[String]):Unit={
    for(i<- 1 to 4){
      if(i==1 || i==4) {
        for (j <- 1 to 6) {
          print("* ")
        }
      }
      else{
          for(j<- 1 to 6){
            if(j==1 || j==6){
              print("* ")
            }else{
              print("  ")
            }
          }
      }
      println()
    }
  }
}
