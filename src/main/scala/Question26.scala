object Question26 {
  def main(args:Array[String]):Unit={
    var i = 1
    while (i<=35){
      print(s"$i,even")
      if(i!=35){
        print(",")
      }
      i+=2
    }
  }
}
