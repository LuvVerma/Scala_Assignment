object Question3 {
  def main(args:Array[String]):Unit={
    var a = 10
    var b = 20
    var c = 30
    if(a>b && a>c){
      println(s"$a is the greatest!")
    }
    else if(b>a && b>c){
      println(s"$b is the greatest!")
    }
    else{
      println(s"$c is the greatest!")
    }
  }
}
