object For_Loop_Question15 {
  def main(args:Array[String]):Unit={
    var List = Array('a','e','i','o','u')
//    var input_str = "Elephant"
    print("Enter the string : ")
    var input_str = scala.io.StdIn.readLine()
    var str = input_str.toLowerCase()
    var count = 0
    for(i<- 0 until str.length){
      for(j<- 0 until List.length){
        if(str(i)==List(j)){
          count+=1
        }
      }
    }
    println("No. of vowels in the string are : "+count)
  }
}
