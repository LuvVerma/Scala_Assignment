object Question18 {
  def main(args:Array[String]):Unit={
    var sum = 0
    var count = 0
    var i = 24
    while (i<=100) {
      //println(i)
      sum = sum+i
      i+=2
      count+=1
    }
    var avg = sum/count
    println(s"Avg of 24,26,28,...,100 is $avg")
  }
}
