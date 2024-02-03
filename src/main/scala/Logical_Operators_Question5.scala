object Logical_Operators_Question5 {
  def main(args:Array[String]):Unit={
    var age = 20
    if(age>=18){
      println("Eligible for both vote and drive !")
    }
    else if(age>=16 && age<18){
      println("Eligible only to drive !")
    }
    else{
      println("Not eligible for anything! Sit at home!")
    }
  }
}
