object Logical_Operators_Question6 {
  def main(args:Array[String]):Unit={
    var number = 25
    if((number>=1 && number<=10) || (number>=20 && number<=30)){
      println("Number is in range !")
    }
    else {
      println("Number not in range !")
    }
  }
}
