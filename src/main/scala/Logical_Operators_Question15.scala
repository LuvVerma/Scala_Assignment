object Logical_Operators_Question15 {
  def main(args:Array[String]):Unit={
    var age = 15
    if(age<13){
      println("You are a child !")
    }
    else if(age>=13 && age<=19){
      println("Huhh! Teenagers!")
    }
    else {
      println("Yeah! You are an Adult!")
    }
  }
}
