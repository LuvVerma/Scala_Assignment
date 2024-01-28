object Question6 {
  def main(args:Array[String]):Unit={
    println("Welcome to Simple Calculator!")
    print("Enter first number : ")
    var num1 = scala.io.StdIn.readInt()
    print("Enter second number : ")
    var num2 = scala.io.StdIn.readInt()
    println("Which operation would you like to perform '+' , '-' , '*' , '/' ?")
    print("Enter the symbol : ")
    var symbol = scala.io.StdIn.readChar()

    var result = symbol match {
      case '+' => num1+num2
      case '-' => num1-num2
      case '*' => num1*num2
      case '/' => num1/num2
      case _ => "Invalid Character/Symbol"
    }
    println(result)
  }
}
