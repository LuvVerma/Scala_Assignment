object Logical_Operators_Question2 {
  def main(args:Array[String]):Unit={
    var number = -15
    if(number<(-10) || number>10){
      println(s"Yes, $number is in range!")
    }
    else{
      println("Sorry! Try another number!")
    }
  }
}
