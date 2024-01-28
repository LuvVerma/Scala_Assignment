object Question5 {
  def main(args:Array[String]):Unit={
    var num = 92
    if(num>=0 && num<=100){
      if(num>90 && num<=100){
        println("Super Smart!")
      }else if(num>80 && num<=90){
        println("Smart!")
      }else if(num>70 && num<=80){
        println("Smart Enough!")
      }else if(num>60 && num<=70){
        println("Just Smart!")
      }else if(num>35 && num<=60){
        println("No Smart!")
      } else{
        println("Dumb!")
      }
    }
    else {
      println("Invalid Input!")
    }
  }

}
