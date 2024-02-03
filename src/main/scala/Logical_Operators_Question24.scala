object Logical_Operators_Question24 {
  def main(args:Array[String]):Unit={
    var number = 9
    checkDiv(number)
  }
  def checkDiv(num:Int):Unit={
    if(num%2==0 || num%3==0){
      println(num + " is divisible by either 2 or 3!")
    }
    else{
      println("Try another number!")
    }
  }
}
