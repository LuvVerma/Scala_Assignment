object Pattern_Question10 {
  def main(args:Array[String]):Unit= {
    var a = 1
    var b = 4
    for (i <- 1 to 5) {
      for (k <- 1 to b) {
        print(" ")
      }
      b -= 1
      for (j <- 1 to a) {
        print("* ")
      }
      println()
      println()
      a += 2
    }
  }
}
