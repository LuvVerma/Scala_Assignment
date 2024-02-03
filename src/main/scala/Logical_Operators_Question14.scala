object Logical_Operators_Question14 {
  def main(args:Array[String]):Unit={
    var number = -6
    if(number<0 && number%2==0){
      println(number+" is both non-positive and even!")
    }
    else {
      println("Try some other number !")
    }
  }
}
