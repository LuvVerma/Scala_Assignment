object For_Loop_Question10 {
  def main(args:Array[String]):Unit={
    var prime = true
    var i = 2
    var num = 91
    while(i<num && prime==true){
      if(num%i==0){
        prime=false
      }
      i+=1
    }
    if(prime){
      println(s"$num is a Prime Number!")
    }else{
      println(s"$num is not a prime number!")
    }
  }
}
