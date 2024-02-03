object Logical_Operators_Question12 {
  def main(args:Array[String]):Unit={
    var amount = 120
    if(amount>150){
      println("Eligible for Discount !")
    }
    else if(amount>100 && amount<=150){
      println("Eligible for Free Shipping !")
    }
    else{
      println("Not eligible for anything! Pay full price !")
    }
  }

}
