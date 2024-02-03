object Logical_Operators_Question9 {
  def main(args:Array[String]):Unit={
    var number = 35
    if(number%5==0 && number%7==0){
      println("Yes, " +number+ " is divisible by both 5 and 7 !")
    }
    else {
      println("Try some other number !")
    }
  }
}
