object Logical_Operators_Question4 {
  def main(args:Array[String]):Unit={
    var number = 18
    if(number%4==0 || number%6==0){
      println(s"Yes, $number is divisible by either 4 or 6 !")
    }
    else{
      println("Sorry! Try another number!")
    }
  }
}
