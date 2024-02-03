object Logical_Operators_Question31 {
  def main(args:Array[String]):Unit={
    var number = 24
    checkDiv(number)
  }
  def checkDiv(num:Int):Unit={
    if(num%4==0 || num%6==0){
      println(num + " is divisible by either 4 or 6!")
    }
    else{
      println("Try another number!")
    }
  }
}
