object Logical_Operators_Question10 {
  def main(args:Array[String]):Unit={
    var number = -8
    if(number>0 || number%2==0){
      println(number+" is either non-negative or even!")
    }
    else {
      println("Try some other number !")
    }
  }
}
