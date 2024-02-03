object Logical_Operators_Question23 {
  def main(args:Array[String]):Unit={
    var amount = 180
    var loyalty_card = true
    if(amount>200 || loyalty_card){
      println("Yes, Discount available !")
    }
    else {
      println("Shut-up and pay full price!")
    }
  }
}
