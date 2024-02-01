object For_Loop_Question8 {
  def main(args:Array[String]):Unit={
    val number = 5
    var fact = factorial(number)
    println(fact)
  }
  def factorial(num:Int): Int = {
    if(num<0) {
      println("Wrong Input!")
      num
    }else if(num==0){
      1
    }else{
      var f = num*factorial(num-1)
      f
    }
  }
}
