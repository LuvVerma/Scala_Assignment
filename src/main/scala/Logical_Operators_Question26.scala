object Logical_Operators_Question26 {
  def main(args:Array[String]):Unit={
    var age = 70
    var new_customer = false
    if(age>65 && new_customer==false){
      println("Yes, Eligible for Senior Citizen Discount !")
    }
    else {
      println("Pay full price!")
    }
  }
}
