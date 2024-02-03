object Logical_Operators_Question25 {
  def main(args:Array[String]):Unit={
    var number = 7
    if(number>0 && number%3!=0){
      println(number + " is positive and not divisible by 3!")
    }
    else {
      println("Try another number!")
    }
  }
}
