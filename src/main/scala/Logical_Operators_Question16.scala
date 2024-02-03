object Logical_Operators_Question16 {
  def main(args:Array[String]):Unit={
    var num = 25
    if(num%2==0 || num%5==0){
      println(num + " is divisible by either 2 or 5 !")
    }
    else{
      println("Come-on man! Give something else!")
    }
  }
}
