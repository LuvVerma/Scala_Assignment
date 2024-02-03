object Logical_Operators_Question27 {
  def main(args:Array[String]):Unit={
    var number = 11
    checkPrimeOdd(number)
  }
  def checkPrimeOdd(num:Int):Unit={
    var prime = true
    for(i<- 2 until num){
      if(num%i==0){
        prime = false
      }
    }
    if(num%2!=0 || prime){
      println(num+" is either odd or prime !")
    }
    else {
      println("Try another number !")
    }
  }
}
