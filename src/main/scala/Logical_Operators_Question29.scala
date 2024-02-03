object Logical_Operators_Question29 {
  def main(args:Array[String]):Unit={
    var number = 14
    if(number>0 && number%7!=0){
      println(number + " is non-negative and not divisible by 7!")
    }
    else {
      println("Try another number!")
    }
  }
}
