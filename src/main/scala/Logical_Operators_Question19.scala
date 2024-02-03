object Logical_Operators_Question19 {
  def main(args:Array[String]):Unit={
    var number = 21
    if(number%3==0 && number%7==0){
      println(number + " is a multiple of both 3 and 7!")
    }
    else{
      println("Try something else!")
    }
  }
}
