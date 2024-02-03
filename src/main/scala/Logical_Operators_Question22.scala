object Logical_Operators_Question22 {
  def main(args:Array[String]):Unit={
    var number = 15
    checkDiv(number)
  }
  def checkDiv(num:Int):Unit={
    if(num%3==0 && num%5==0){
      println(num + " is divisible by both 3 and 5!")
    }
    else{
      println("Try another number!")
    }
  }
}
