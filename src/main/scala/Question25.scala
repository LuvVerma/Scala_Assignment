object Question25 {
  def main(args:Array[String]):Unit={
    //Way 1 : Pattern
    var i = 4
    while (i>=(-12)){
      println(s"5*$i")
      i-=1
    }
    //Way 2 : Multiplied Values
    var j = 4
    while (j>=(-12)){
      var value = 5*j
      println(value)
      j-=1
    }
  }
}
