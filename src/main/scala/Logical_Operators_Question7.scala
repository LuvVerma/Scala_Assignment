object Logical_Operators_Question7 {
  def main(args:Array[String]):Unit={
    var number = -7
    if(number%2!=0 && number<0){
      println(s"Yes, $number is both negative and odd !")
    }
    else{
      println("Sorry! Try another number!")
    }
  }
}
