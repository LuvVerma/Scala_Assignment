object Logical_Operators_Question28 {
  def main(args:Array[String]):Unit={
    var amount = 120
    if(amount>150){
      println("Eligible for Discount and Free Shipping!")
    }
    else if(amount>100 && amount<=150){
      println("Eligible for Free Shipping !")
    }
    else{
      println("Not eligible for anything! Pay full price !")
    }
  }
}
