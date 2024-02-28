object Whatsapp_Feb26_Question9 {
  def main(args:Array[String]):Unit={
    var arr = Array(1,3,7,2,3,9,3)
    var present = false
    for (i <- 0 until arr.length) {
      if (arr(i) == 3) {
        println("No. 3 is present at array Index "+i)
        present=true
      }
    }
    if(present==false){
      println("Not Present!")
    }
  }
}
