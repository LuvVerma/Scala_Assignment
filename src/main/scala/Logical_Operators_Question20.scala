object Logical_Operators_Question20 {
  def main(args:Array[String]):Unit={
    var number = 45
    if(number%5==0 || number%9==0){
      println(number + " is divisible by either 5 or 9!")
    }
    else{
      println("Try something else!")
    }
  }
}
