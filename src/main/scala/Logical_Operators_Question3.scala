object Logical_Operators_Question3 {
  def main(args:Array[String]):Unit={
    var number = 27
    if(number%2!=0 && number%3!=0){
      println(s"Yes, $number is both odd and not divisible by 3 !")
    }
    else{
      println("Sorry! Try another number!")
    }
  }
}
