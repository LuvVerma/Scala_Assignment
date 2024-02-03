object For_Loop_Question18 {
  def main(args:Array[String]):Unit={
    var number = 4
    var i = 1
    var root = 0
    while (i<=(number/2)){
      if((i*i)==number){
        root = i
      }
      i+=1
    }
    if(root==0){
      println(number + " is not a perfect square!")
    }
    else{
      println("Yes, " + number + " is a perfect square! And the square root is "+root+" !")
    }
  }
}
