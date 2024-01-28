object Question2 {
  def main(args:Array[String]):Unit={
    CtoF(80)
  }
  def CtoF(c:Int):Unit={
    var f = (c*9/5)+32
    print(s"The temperature in Fahrenheit is : $f F ")
  }

}
