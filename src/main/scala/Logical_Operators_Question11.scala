object Logical_Operators_Question11 {
  def main(args:Array[String]):Unit={
    var prime = true
    var num = 17
    for(i<- 2 until num){
      if(num%i==0){
        prime = false
      }
    }
    if(prime && num%2!=0){
      println(num+" is both prime and odd !")
    }
    else {
      println("Try another number !")
    }
  }
}
