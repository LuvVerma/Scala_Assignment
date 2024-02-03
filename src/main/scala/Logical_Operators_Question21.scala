object Logical_Operators_Question21 {
  def main(args:Array[String]):Unit={
    var number = 15
    if(number%2!=0 && number%4!=0){
      println(number + " is both odd and not divisible by 4!")
    }
    else{
      println("Try something else!")
    }
  }
}
