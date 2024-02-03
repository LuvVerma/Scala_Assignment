object Logical_Operators_Question1 {
  def main(args:Array[String]):Unit={
    var number = 14
    if(number%2==0 && number>0){
      println(s"Yes, $number is both even and positive!")
    }
    else{
      println("Sorry! Try another number!")
    }
  }
}
