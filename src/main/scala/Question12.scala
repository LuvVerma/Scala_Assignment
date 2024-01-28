object Question12 {
  def main(args:Array[String]):Unit={
    print("Enter starting number : ")
    var a = scala.io.StdIn.readInt()
    print("Enter ending number : ")
    var b = scala.io.StdIn.readInt()
    var count = 0
    for(num<- a to b){
      if(num%2==0){
        //println(num)
        count+=1
      }
    }
    println(s"Total no. of even numbers between $a and $b is $count")
  }
}
