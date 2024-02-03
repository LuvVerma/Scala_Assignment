object Logical_Operators_Question30 {
  def main(args:Array[String]):Unit={
    var age = 22
    var free_trial = true
    if(age<25 || free_trial){
      println("Eligible for student discount or free trial!")
    }
    else {
      println("No Discount!")
    }
  }
}
