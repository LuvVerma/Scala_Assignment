object For_Loop_Question13 {
  def main(args:Array[String]):Unit={
    //var str = "madam"
    print("Enter your string : ")
    var input_str = scala.io.StdIn.readLine()
    var str = input_str.toLowerCase()
    var reverse = ""
    for(i<- str.length-1 to 0 by -1){
      reverse = reverse + str(i)
      //var str2 = str(i).toString
      //reverse.concat(str2)
    }
    //println(str)
    //println(reverse)
    if(str==reverse){
      println("Yes, the given string is a palindrome!")
    }
    else {
      println("No, the given string is not a palindrome!")
    }
  }
}
