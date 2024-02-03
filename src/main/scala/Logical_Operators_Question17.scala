object Logical_Operators_Question17 {
  def main(args:Array[String]):Unit={
    // Same as Question 8
    //Question is Invalid will always be Not Eligible
    var age = 70
    if(age>60 && age<25){
      println("Eligible for both Discounts !")
    }
    else {
      println("Not eligible !")
    }
  }
}
