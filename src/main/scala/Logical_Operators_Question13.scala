object Logical_Operators_Question13 {
  def main(args:Array[String]):Unit={
    var num = 24
    if(num%3==0 || num%8==0){
      println(num+" is divisible by either 3 or 8 !")
    }
    else {
      println("Try some other number !")
    }
  }
}
