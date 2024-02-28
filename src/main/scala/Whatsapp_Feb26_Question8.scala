object Whatsapp_Feb26_Question8 {
  def main(args: Array[String]): Unit = {
    var arr = Array(4, 9, 12, 17, 22)
    for (i <- 0 until arr.length) {
      if (arr(i) == 17) {
        if (i % 2 == 0) {
          println("17 is at Even Index")
        }
        else {
          println("17 is at Odd Index")
        }
      }
    }
  }
}
