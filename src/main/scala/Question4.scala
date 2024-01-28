object Question4 {
  def main(args:Array[String]):Unit={
    var a = 122
    if(a>=100 && a<=1000){
      if(a%2==0){
        println("Even")
        var rem = a%3
        println(s"Remainder is $rem")
      }
      else{
        println("Odd")
        var rem = a%2
        println(s"Remainder is $rem")
      }
    }
    else {
      println("Wrong Number!")
    }
  }
}
